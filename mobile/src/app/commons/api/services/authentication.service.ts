/**
 * Created by marcosflavio on 6/17/17.
 */
import {Injectable} from "@angular/core";
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map'
import {ROOT, USER} from "../constants/server.constants";

@Injectable()
export class AuthenticationService {
    public token: string;
    urlRoot = ROOT.DEV;
    urlLogin = USER.LOGIN;
    urlAuth: string;

    constructor(private http: Http) {
        this.urlAuth = this.urlRoot + this.urlLogin;
        let currentUser = JSON.parse(localStorage.getItem('currentUser'));
        this.token = currentUser && currentUser.token;
    }

    login(username: string, password: string): Observable<boolean> {
        return this.http.post(this.urlAuth, JSON.stringify({ username: username, password: password }))
            .map((response: Response) => {
                let token = response.json() && response.json().token;
                if (token) {
                    this.token = token;
                    localStorage.setItem('currentUser', JSON.stringify({ username: username, token: token }));
                    return true;
                } else {
                    return false;
                }
            });
    }

    logout(): void {
        this.token = null;
        localStorage.removeItem('currentUser');
    }
}