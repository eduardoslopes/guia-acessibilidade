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

    constructor() {
    }

    ngOnInit(): void {}
}