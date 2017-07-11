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
    locationType: LocationTypeModel;
    guideUser: GuideUserModel;
    comments: CommentModel[];
    accessibilityTypes: AccessibilityTypeModel[];

    constructor(id: number, name: string, latitude: number,
                longitude: number, locationType: LocationTypeModel, guideUser: GuideUserModel,
                comments: CommentModel[], accessibilityTypes: AccessibilityTypeModel[]){
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.locationType = locationType;
        this.guideUser = guideUser;
        this.comments = comments;
        this.accessibilityTypes = accessibilityTypes;
    }
}