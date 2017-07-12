/**
 * Created by marcosflavio on 6/15/17.
 */
import { Component} from '@angular/core';

import {LocationModel} from '../../../commons/models/location';

@Component({
    selector: 'ons-page',
    template: require('./accessible-location-detais.html')
})
export class AccessibleLocationDetailsComponent {

    accessibleLocation: LocationModel;

    constructor() {
    }

    ngOnInit(): void {}
}