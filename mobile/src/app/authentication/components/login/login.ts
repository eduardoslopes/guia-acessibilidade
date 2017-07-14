/**
 * Created by marcosflavio on 6/16/17.
 */
import { Component} from '@angular/core';
import {UserAuthenticationService} from "../../services/user-authentication.service";
import {OnsNavigator} from "angular2-onsenui";

@Component({
    selector: 'ons-page',
    template: require('./login.html'),
    styles: [require('./login.css').toString()]
})
export class LoginComponent {

    username: string = null;
    password: string = null;

    constructor(private userAuthenticationService: UserAuthenticationService, private navigator: OnsNavigator) {
    }

    ngOnInit(): void {}

    login(){
       this.userAuthenticationService.login(this.username, this.password).subscribe(data => {
           if(data) {
               this.navigator.element.popPage();
           }
       });
    }
}