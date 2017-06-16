/**
 * Created by marcosflavio on 6/15/17.
 */
import { ErrorHandler } from '@angular/core';
import {
    ViewChild,
    Params,
    OnsNavigator,
    OnsenModule,
    NgModule,
    CUSTOM_ELEMENTS_SCHEMA
} from 'angular2-onsenui';

import { AccessibleLocationDetailsComponent } from '../accessible-location/components/accessible-location-details/accessible-location-details'
@NgModule({
    imports: [],
    declarations: [AccessibleLocationDetailsComponent],
    exports: [],
    entryComponents: [AccessibleLocationDetailsComponent],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})

export class AccessibleLocationModule {}