/**
 * Created by marcosflavio on 6/15/17.
 */
import { Component} from '@angular/core';

import {Location} from '../../models/location';

@Component({
    template: './accessible-location-details.html'
})
export class AccessibleLocationDetailsComponent {

    accessibleLocation: Event;

    constructor() {
    }
     ngOnInit(): void {}
}