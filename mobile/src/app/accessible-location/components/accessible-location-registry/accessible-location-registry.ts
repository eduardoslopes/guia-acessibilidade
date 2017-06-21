/**
 * Created by marcosflavio on 6/16/17.
 */
import { Component} from '@angular/core';
import {LocationModel} from '../../models/location';

@Component({
    selector: 'ons-page',
    template: require('./accessible-location-registry.html')
})
export class AccessibleLocationRegitryComponent {

    accessibleLocation: LocationModel;
    lat2: number = -3.734680;
    lng2: number = -38.469289;

    constructor() {
    }

    ngOnInit(): void {}
}