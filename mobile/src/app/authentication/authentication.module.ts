/**
 * Created by marcosflavio on 6/16/17.
 */
import {
    ViewChild,
    Params,
    OnsNavigator,
    OnsenModule,
    NgModule,
    CUSTOM_ELEMENTS_SCHEMA
} from 'angular2-onsenui';
import {LoginComponent} from "./components/login/login";
import {SignInComponent} from "./components/sign-in/sign-in";
import {AuthenticationService} from "./services/user-authentication.service";

@NgModule({
    imports: [],
    declarations: [LoginComponent, SignInComponent],
    exports: [],
    entryComponents: [LoginComponent, SignInComponent],
    providers: [AuthenticationService],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})

export class AuthenticationModule {}