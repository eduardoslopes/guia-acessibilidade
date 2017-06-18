/**
 * Created by marcosflavio on 6/15/17.
 */
import {Injectable} from "@angular/core";
import {HttpService} from "../../api/services/http.service";
import {Observable} from "rxjs";
import {GEOLOCATION} from "../constants/google-geolocation.constants";

@Injectable()
export class GoogleGeoLocationService {

    private doGeocodeUrl = GEOLOCATION.DOGEOCODE;

    constructor(private httpService: HttpService) {
    }

    doGeocode(address: string): Observable<any> {
        return this.httpService.post(this.doGeocodeUrl, address)
            .map(result => result.json());
    }
}