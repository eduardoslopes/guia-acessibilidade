/**
 * Created by marcosflavio on 6/16/17.
 */
export class GuideUserModel {
    id: number;
    name: string;
    cpf: string;
    username: string;
    password: string;

    constructor(username: string, password: string, name?: string, cpf?: string){
        this.username = username;
        this.password = password;
        this.name = name;
        if(cpf)
            this.cpf = cpf;
    }

    setId(id: number){
        this.id = id;
    }
}