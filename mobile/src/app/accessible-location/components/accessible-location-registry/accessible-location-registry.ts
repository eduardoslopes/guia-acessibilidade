/**
 * Created by marcosflavio on 6/16/17.
 */
import {Component, NgZone} from '@angular/core';
import {LocationModel} from '../../models/location';
import {OnsNavigator, OnsenModule, CUSTOM_ELEMENTS_SCHEMA} from 'angular2-onsenui';
import {AccessibleLocationService} from "../../services/accessible-location.service";
import {ACCESSIBLELOCATION} from "../../constants/accessible-location.constants";
import {GuideUserModel} from "../../../commons/models/guideUser";
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
    constructor(private zone: NgZone, private service: AccessibleLocationService) {
    }

    ngOnInit(): void {
        this.guideUser = new GuideUserModel("eduardo", "chupapica", "Eduardo");
    }

    onClickMap(ev: any): void {
        if(ev != null) {
            this.latitude = ev.latlng.lat;
            this.longitude = ev.latlng.lng;
            console.log(this.latitude);
        }
    }

    createLocation() {
        //let location = new LocationModel(this.name, this.latitude, this.longitude, this.guideUser);
        //this.sendToServer({name: this.name, latitude: this.latitude, longitude: this.longitude});
        //TODO FIX BUG, ATTRIBUTS BECOME UNDEFINED
    }

    sendToServer(location) {
        this.service.save(ACCESSIBLELOCATION.MARKER, location);
    }
}