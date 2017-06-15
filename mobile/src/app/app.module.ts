/**
 * Created by marcosflavio on 6/7/17.
 */

import { NgModule, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import {HttpModule} from '@angular/http';
import {OnsenModule} from 'angular2-onsenui';
import {CommonsModule} from './commons/commons.module'
import {AccessibleLocationModule} from './accessible-location/accessible-location.module'
import {MyApp} from './app';

@NgModule({
    imports: [
        OnsenModule,
        HttpModule,
        CommonsModule,
        AccessibleLocationModule
    ],
    declarations: [
        MyApp,
    ],
    bootstrap: [
        MyApp,
    ],
    schemas: [
        CUSTOM_ELEMENTS_SCHEMA,
    ],
})
export class AppModule {}
