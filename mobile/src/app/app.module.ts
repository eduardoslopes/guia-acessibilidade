/**
 * Created by marcosflavio on 6/7/17.
 */

import { NgModule, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import {HttpModule} from '@angular/http';
import {OnsenModule} from 'angular2-onsenui';
import {CommonsModule} from './commons/commons.module'
import {AccessibleLocationModule} from './accessible-location/accessible-location.module'
import {MyApp} from './app';
import {AuthenticationModule} from "./authentication/authentication.module";
import {BrowserModule} from "@angular/platform-browser";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";

@NgModule({
    imports: [
        BrowserModule,
        OnsenModule,
        HttpModule,
        CommonsModule,
        AccessibleLocationModule,
        AuthenticationModule
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
