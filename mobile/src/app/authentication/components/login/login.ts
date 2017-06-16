/**
 * Created by marcosflavio on 6/16/17.
 */
import { Component} from '@angular/core';
import {GuideUserModel} from "../../models/guideUser";

@Component({
    selector: 'ons-page',
    template: require('./login.html')
})
export class LoginComponent {

    guideUser: GuideUserModel;

    constructor() {
    }

    ngOnInit(): void {}
}