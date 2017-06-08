/**
 * Created by marcosflavio on 6/7/17.
 */
require('onsenui/stylus/blue-basic-theme.styl');
require('onsenui/css/onsenui.css');

import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';
import { Map } from '../commons/leaflet/components/map/map'
import { Marker } from '../commons/leaflet/components/marker/marker'
import {OnsenModule} from 'angular2-onsenui';

@NgModule({
    declarations: [Map, Marker],
    imports: [OnsenModule],
    exports: [Map, Marker],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})

export class CommonsModule {

}