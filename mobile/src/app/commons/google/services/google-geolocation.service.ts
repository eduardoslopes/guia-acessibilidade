/**
 * Created by marcosflavio on 6/15/17.
 */
import {Injectable} from "@angular/core";
import {HttpService} from "../../api/http.service";
import {Observable} from "rxjs";

@Injectable()
export class GoogleGeoLocationService {

    private geoLococationServiceUrl = "/geolocation";

    constructor(private httpService: HttpService) {
    }

    doGeocode(address: string): Observable<any> {
        return this.httpService.post(this.geoLococationServiceUrl, address)
            .map(result => result.json());
    }
}