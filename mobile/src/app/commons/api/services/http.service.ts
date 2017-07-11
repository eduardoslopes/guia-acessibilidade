/**
 * Created by marcosflavio on 6/17/17.
 */
import {Http, Headers, RequestOptionsArgs, Response} from '@angular/http';
import {Injectable} from '@angular/core';
import {ROOT} from '../constants/server.constants';
import {Observable} from "rxjs/Observable";
import {AuthenticationService} from "./authentication.service";
import {GuideUserModel} from "../../models/guideUser";

@Injectable()
export class HttpService {

    urlRoot = ROOT.DEV;

    constructor(private http: Http, private authenticationService: AuthenticationService) {

    }

    get(url: string, options?: RequestOptionsArgs) : Observable<Response> {
        let requestOptionsArgs: RequestOptionsArgs = options ? options : {headers: new Headers({'Content-Type': 'application/json',
                'Authorization': 'Basic ' + btoa(this.authenticationService.user.username + ":" + this.authenticationService.user.password)})};
        url = this.urlRoot + url;
        return this.http.get(url, requestOptionsArgs);
    }

    post(url: string, body: any, options?: RequestOptionsArgs) : Observable<Response> {
        let requestOptionsArgs: RequestOptionsArgs = options ? options : {headers: new Headers({'Content-Type': 'application/json',
                'Authorization': 'Basic ' + btoa(this.authenticationService.user.username + ":" + this.authenticationService.user.password)})};
        url = this.urlRoot + url;
        return this.http.post(url, body, requestOptionsArgs);
    }

    put(url: string, body: any, options?: RequestOptionsArgs) : Observable<Response> {
        let requestOptionsArgs: RequestOptionsArgs = options ? options : {headers: new Headers({'Content-Type': 'application/json',
                'Authorization': 'Basic ' + btoa(this.authenticationService.user.username + ":" + this.authenticationService.user.password)})};
        url = this.urlRoot + url;
        return this.http.put(url, body, requestOptionsArgs);
    }
}

