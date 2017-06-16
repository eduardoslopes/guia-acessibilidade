/**
 * Created by marcosflavio on 6/7/17.
 */

import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { Map } from '../commons/leaflet/components/map/map'
import { Marker } from '../commons/leaflet/components/marker/marker'
import { Search } from '../commons/google/components/search-address/search'
import {OnsenModule} from 'angular2-onsenui';

@NgModule({
    declarations: [Map, Marker, Search],
    imports: [OnsenModule],
    exports: [Map, Marker, Search],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})

export class CommonsModule {

}