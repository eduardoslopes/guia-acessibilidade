/**
 * Created by marcosflavio on 6/15/17.
 */
export class Location {
    latitude: number;
    longitude: number;
    name: string;

    constructor(name: string, latitude: number, longitude: number){
        this.latitude = latitude;
        this. longitude = longitude;
        this.name = name;
    }
}