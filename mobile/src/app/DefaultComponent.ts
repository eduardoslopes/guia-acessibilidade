/**
 * Created by eduardolopes on 13/07/17.
 */
import {
    Component,
    OnsNavigator,
} from 'angular2-onsenui';
import {LocationModel} from "./commons/models/location";
import {LocationTypeModel} from "./commons/models/locationType";
import {AccessibleLocationService} from "./accessible-location/services/accessible-location.service";
import {ACCESSIBLELOCATION} from "./accessible-location/constants/accessible-location.constants";
import {LoginComponent} from "./authentication/components/login/login";
import 'rxjs/Rx';
import {AuthenticationService} from "./commons/api/services/authentication.service";

@Component({
    selector: 'ons-page',
    template: require('./app.html'),
    styles: [require('./../assets/leaflet.css').toString()],
    providers: []
})
export class DefaultComponent {
    lat: number;
    lng: number;
    lat2: number;
    lng2: number;
    locationName: string;
    marker1: LocationModel;
    locations: LocationModel[] = null;

    constructor(private accessibleLocationService: AccessibleLocationService,
                private authenticationService: AuthenticationService,
                private navigator: OnsNavigator) {
        this.lat = -3.700852;
        this.lng = -38.586988;
        this.lat2 = -3.734680;
        this.lng2 = -38.469289;
        this.locationName = 'Shopping da Bezerra';
        this.marker1 = new LocationModel('Shopping da Bezerra', -3.700852, -38.586988, 'Descrição');
        this.marker1.votes = 0;
        this.marker1.markerType = new LocationTypeModel('teste');
    }

    sendVote(vote) {
        let user = this.authenticationService.user;

        vote.username = user.username;
        this.accessibleLocationService.update(ACCESSIBLELOCATION.MARKER + '/applyVote', vote).map((result) => {
            let updatedLocation = result.json();
            location.reload();
            //TODO Resolver isso!
        }).subscribe();
    }
    ngOnInit(): void {
        this.getLocations();
    }

    getLocations(): void {
        this.accessibleLocationService.findAll(ACCESSIBLELOCATION.MARKER).map((result) => {
            this.locations = result.json();
        }).catch(error =>{
            this.navigator.element.pushPage(LoginComponent);
            return null;
        }).subscribe();
    }

}
