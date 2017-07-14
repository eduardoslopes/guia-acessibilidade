/**
 * Created by marcosflavio on 6/16/17.
 */
import {Component, NgZone} from '@angular/core';
import {AccessibleLocationService} from "../../services/accessible-location.service";
import {ACCESSIBLELOCATION} from "../../constants/accessible-location.constants";
import {GuideUserModel} from "../../../commons/models/guideUser";
import {Observable} from "rxjs";
import {LocationModel} from '../../../commons/models/location';
import {LocationTypeModel} from "../../../commons/models/locationType";

@Component({
    selector: 'ons-page',
    template: require('./accessible-location-registry.html')
})
export class AccessibleLocationRegitryComponent {
    latitude: number;
    longitude: number;
    description: string = null;
    name: string = null;
    guideUser: GuideUserModel = null;
    locationtypes: LocationTypeModel[];
    markerType: LocationTypeModel = null;

    constructor(private zone: NgZone, private service: AccessibleLocationService) {
        this.guideUser = new GuideUserModel("marcosflavio", "123456", "marcos flavio");
        this.guideUser.setId(1);
    }

    ngOnInit(): void {
        this.getLocationTypes();
    }

    getLocationTypes(): void {
        this.service.findAll(ACCESSIBLELOCATION.GETMARKERTYPE).map(result => {
            this.locationtypes = result.json();
        }).subscribe();
    }

    onClickMap = (ev: any) =>{

        if(ev != null) {
            this.latitude = ev.latlng.lat;
            this.longitude = ev.latlng.lng;
        }
    };

    createLocation() {
        let location = new LocationModel(this.name, this.latitude, this.longitude, this.description);
        location.markerType = this.markerType;
        location.user = this.guideUser;
        location.votes = 0;

        this.sendToServer(location);
    }

    sendToServer(location) {
        this.service.save(ACCESSIBLELOCATION.MARKER, location).subscribe(response => {
            if(response.status == 200){
                //TODO Change page
            }
        });
    }

}