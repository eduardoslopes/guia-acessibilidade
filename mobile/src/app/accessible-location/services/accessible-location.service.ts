/**
 * Created by marcosflavio on 6/16/17.
 */
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {HttpService} from "../../commons/api/services/http.service";

@Injectable()
export class AccessibleLocationService {

    constructor(private httpService: HttpService) {
    }

    save(url: string, T: any): Observable<any> {
        return this.httpService.post(url, T)
            .map(result => result.json());
    }

    findAll(url: string): Observable<any> {
        return this.httpService.get(url)
            .map(res => res.json());
    }

    findById(url: string, id: number): Observable<any> {
        url =`${url}?id=${id}`;
        return this.httpService.get(url)
            .map(res => res.json());
    }

    update(url: string, T: any): Observable<any> {
        return this.httpService.put(url, T)
            .map(result => result.json());
    }
}