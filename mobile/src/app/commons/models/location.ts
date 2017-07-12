import {LocationTypeModel} from "./locationType";
import {GuideUserModel} from "../../authentication/models/guideUser";
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
    guideUser: GuideUserModel;
    accessibilityTypes: AccessibilityTypeModel[];

    constructor(id: number, name: string, latitude: number,
                longitude: number, votes: number, markerType: LocationTypeModel, guideUser: GuideUserModel,
                accessibilityTypes: AccessibilityTypeModel[]){
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.markerType = markerType;
        this.guideUser = guideUser;
        this.accessibilityTypes = accessibilityTypes;
        this.votes = votes;
    }
}