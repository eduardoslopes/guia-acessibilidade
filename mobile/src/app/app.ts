import {
    Component,
    ViewChild,
    Params,
    OnsNavigator,
    OnsenModule,
    NgModule,
    CUSTOM_ELEMENTS_SCHEMA,
    ViewContainerRef
} from 'angular2-onsenui';
import {LocationModel} from "./accessible-location/models/location";
import {Observable} from "rxjs";
import {AccessibleLocationService} from "./accessible-location/services/accessible-location.service";
import {ACCESSIBLELOCATION} from "./accessible-location/constants/accessible-location.constants";
@Component({
  selector: 'app',
  template: require('./app.html'),
  styles: [require('./../assets/leaflet.css').toString()],
  providers: []
})
export class MyApp {

    locations: LocationModel[] = null;

    constructor(private accesibleLocationService: AccessibleLocationService) {
    }

    ngOnInit(): void {
        this.getLocations();
    }

    getLocations(): Observable<LocationModel> {
        let typesRequest = this.accesibleLocationService.findAll(ACCESSIBLELOCATION.MARKER);
        typesRequest.subscribe(
            data => {
                if(data) {
                    this.locations = data;
                }
            }
        );
        return typesRequest;
    }

    push() {
    }

    pop() {
    }
}
