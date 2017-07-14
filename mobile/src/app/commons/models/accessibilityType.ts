import {LocationModel} from "./location";
/**
 * Created by marcosflavio on 6/16/17.
 */
export class AccessibilityTypeModel {
    id: number;
    name: string;
    another: boolean;
    locations: LocationModel[];

    constructor(id: number, name: string, another: boolean, locations: LocationModel[]){
        this.id = id;
        this.name = name;
        this.locations = locations;
        this.another = another;
    }
}