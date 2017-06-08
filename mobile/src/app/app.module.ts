/**
 * Created by marcosflavio on 6/7/17.
 */
require('onsenui/stylus/blue-basic-theme.styl');
require('onsenui/css/onsenui.css');

import { NgModule, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import {HttpModule} from '@angular/http';
import {OnsenModule} from 'angular2-onsenui';
import {CommonsModule} from './commons/commons.module'
import {MyApp} from './app';

@NgModule({
    imports: [
        OnsenModule,
        HttpModule,
        CommonsModule
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
