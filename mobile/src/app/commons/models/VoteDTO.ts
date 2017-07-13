/**
 * Created by eduardolopes on 13/07/17.
 */

export class VoteDTO {
    markerId: number;
    voteType: string;
    username: string;


    constructor(markerId: number, voteType: string){
        this.markerId = markerId;
        this.voteType = voteType;
    }
}