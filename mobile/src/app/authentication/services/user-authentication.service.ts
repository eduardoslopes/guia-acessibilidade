/**
 * Created by marcosflavio on 6/16/17.
 */
import {Injectable} from "@angular/core";
import 'rxjs/add/operator/map'
import {AuthenticationService} from "../../commons/api/services/authentication.service";

@Injectable()
export class UserAuthenticationService {

    constructor(private authenticationService: AuthenticationService) {
    }

    login(username: string, password: string): void {
        if (this.authenticationService.login(username, password)) {
            //TODO go to create marker page
        } else {
            // TODO still on the login page, throw message error
        }
    }

    logout(): void {
        this.authenticationService.logout();
        //TODO go to main page or Login page
    }
}