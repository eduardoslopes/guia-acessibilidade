import {
    Component,
} from 'angular2-onsenui';

import {DefaultComponent} from "./DefaultComponent";
@Component({
  selector: 'app',
  template: `
    <ons-template id="app2.html">
        <ons-navigator>
            <ons-page>
                
            </ons-page>
        </ons-navigator>
    </ons-template>
  `
})
export class MyApp {
    page = DefaultComponent
}
