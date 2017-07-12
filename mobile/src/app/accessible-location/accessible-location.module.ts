/**
 * Created by marcosflavio on 6/15/17.
 */
import {
    ViewChild,
    Params,
    OnsNavigator,
    OnsenModule,
    NgModule,
    CUSTOM_ELEMENTS_SCHEMA
} from 'angular2-onsenui';

import { AccessibleLocationDetailsComponent } from '../accessible-location/components/accessible-location-details/accessible-location-details'
import {AccessibleLocationRegitryComponent} from "./components/accessible-location-registry/accessible-location-registry";
import {AccessibleLocationService} from "./services/accessible-location.service";
import {CommonsModule} from "../commons/commons.module";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";
@NgModule({
    imports: [CommonsModule, CommonModule, FormsModule],
    declarations: [AccessibleLocationDetailsComponent, AccessibleLocationRegitryComponent],
    exports: [],
    entryComponents: [AccessibleLocationDetailsComponent, AccessibleLocationRegitryComponent],
    providers: [AccessibleLocationService],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})

export class AccessibleLocationModule {}