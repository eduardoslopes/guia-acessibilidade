/**
 * Created by marcosflavio on 6/7/17.
 */

import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { Map } from '../commons/leaflet/components/map/map'
import { Marker } from '../commons/leaflet/components/marker/marker'
import { Geolocation } from './google/components/geolocation/geolocation'
import {OnsenModule} from 'angular2-onsenui';
import {GoogleGeoLocationService} from "./google/services/google-search.service";

@NgModule({
    declarations: [Map, Marker, Geolocation],
    imports: [OnsenModule],
    exports: [Map, Marker, Geolocation],
    providers: [GoogleGeoLocationService],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})

export class CommonsModule {

}