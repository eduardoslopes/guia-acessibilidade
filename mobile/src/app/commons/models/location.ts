import {LocationTypeModel} from "./locationType";
import {GuideUserModel} from "../../commons/models/guideUser";
import {CommentModel} from "./comment";
import {AccessibilityTypeModel} from "./accessibilityType";
/**
 * Created by marcosflavio on 6/15/17.
 */
export class LocationModel {
    id: number;
    latitude: number;
    longitude: number;
    name: string;
    description: string;
    votes: number;
    markerType: LocationTypeModel;
    user: GuideUserModel;
    accessibilityTypes: AccessibilityTypeModel[];
    completeAddress: string;

    constructor(name: string, latitude: number,
                longitude: number, description: string){
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.description = description;
    }
}