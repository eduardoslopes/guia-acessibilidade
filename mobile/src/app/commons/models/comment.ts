import {LocationModel} from "./location";
import {GuideUserModel} from "../../authentication/models/guideUser";
/**
 * Created by marcosflavio on 6/16/17.
 */
export class CommentModel {
    id: number;
    content: string;
    location: LocationModel;
    guideUser: GuideUserModel;


    constructor(id: number, content: string, location: LocationModel, guideUser: GuideUserModel){
        this.id = id;
        this.content = content;
        this.location = location;
        this.guideUser = guideUser;
    }
}