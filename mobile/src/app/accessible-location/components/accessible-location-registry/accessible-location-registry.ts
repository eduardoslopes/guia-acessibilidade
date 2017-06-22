/**
 * Created by marcosflavio on 6/16/17.
 */
//import { Component} from '@angular/core';
import {LocationModel} from '../../models/location';
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
@Component({
    selector: 'ons-page',
    template: require('./accessible-location-registry.html')
})
export class AccessibleLocationRegitryComponent {
    lat: number = null;
    lng: number = null;

    accessibleLocation: LocationModel;

    constructor() {
    }

    ngOnInit(): void {}

    onClickMap(ev: any): void {
        if(ev != null) {
            this.lat = ev.latlng.lat;
            this.lng = ev.latlng.lng;
        }
    }
}