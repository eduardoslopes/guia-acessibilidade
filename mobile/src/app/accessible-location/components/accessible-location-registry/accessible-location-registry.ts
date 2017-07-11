/**
 * Created by marcosflavio on 6/16/17.
 */
import {Component, NgZone} from '@angular/core';
import {LocationModel} from '../../models/location';
import {OnsNavigator, OnsenModule, CUSTOM_ELEMENTS_SCHEMA} from 'angular2-onsenui';
@Component({
    selector: 'ons-page',
    template: require('./accessible-location-registry.html')
})
export class AccessibleLocationRegitryComponent {
    lat: number;
    lng: number;
    accessibleLocation: LocationModel;

    constructor(private zone: NgZone) {
    }

    ngOnInit(): void {}

    onClickMap(ev: any): void {
        if(ev != null) {
            console.log(ev);
        }
    }
}