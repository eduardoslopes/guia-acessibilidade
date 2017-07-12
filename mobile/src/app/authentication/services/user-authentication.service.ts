/**
 * Created by marcosflavio on 6/16/17.
 */
import {Injectable} from "@angular/core";
import 'rxjs/add/operator/map'
import {AuthenticationService} from "../../commons/api/services/authentication.service";
import {Observable} from "rxjs";

@Injectable()
export class UserAuthenticationService {

    constructor(private authenticationService: AuthenticationService) {
    }

    login(username: string, password: string): Observable<Boolean> {
        return (this.authenticationService.login(username, password));
    }

    logout(): void {
        this.authenticationService.logout();
        //TODO go to main page or Login page
    }
}