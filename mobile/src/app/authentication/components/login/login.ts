/**
 * Created by marcosflavio on 6/16/17.
 */
import { Component} from '@angular/core';
import {UserAuthenticationService} from "../../services/user-authentication.service";

@Component({
    selector: 'ons-page',
    template: require('./login.html')
})
export class LoginComponent {

    username: string = null;
    password: string = null;

    constructor(private userAuthenticationService: UserAuthenticationService) {
    }

    ngOnInit(): void {}

    login(){
        if(this.userAuthenticationService.login(this.username, this.password)){
            //TODO Change Page
            console.log(true);
        }else {
            console.log(false);
            //TODO alert user
        }
    }
}