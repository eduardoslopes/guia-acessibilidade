/**
 * Created by marcosflavio on 6/17/17.
 */
import {Injectable} from "@angular/core";
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map'
import {ROOT, USER} from "../constants/server.constants";
import {GuideUserModel} from "../../models/guideUser";

@Injectable()
export class AuthenticationService {
    public token: string;
    public user: GuideUserModel;
    urlRoot = ROOT.DEV;
    urlLogin = USER.LOGIN;
    urlWithouApi = ROOT.DEVWITHOUAPI;
    urlAuth: string;

    constructor(private http: Http) {
        this.urlAuth = this.urlWithouApi + this.urlLogin;
        let currentUser = JSON.parse(localStorage.getItem('currentUser'));
        if(currentUser && currentUser.username && currentUser.password)
            this.user = new GuideUserModel(currentUser.username, currentUser.password);
    }

    login(username: string, password: string): Observable<boolean> {
        return this.http.post(this.urlAuth, { username: username, password: password })
            .map((response: Response) => {
                let user = response.json() && response.json().username && response.json().name && response.json().password;

                if (user) {
                    this.user = response.json();
                    localStorage.setItem('currentUser', JSON.stringify(this.user));
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