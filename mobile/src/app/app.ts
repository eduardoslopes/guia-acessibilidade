import {
    Component,
    ViewChild,
    Params,
    OnsNavigator,
    OnsenModule,
    NgModule,
    CUSTOM_ELEMENTS_SCHEMA,
    ViewContainerRef
} from 'angular2-onsenui';
import {LocationModel} from "./commons/models/location";
import {LocationTypeModel} from "./commons/models/locationType";
@Component({
  selector: 'app',
  template: require('./app.html'),
  styles: [require('./../assets/leaflet.css').toString()],
  providers: []
})
export class MyApp {
  lat: number;
  lng: number;
  lat2: number;
  lng2: number;
  locationName: string;
  marker1: LocationModel;
  constructor() {
      this.lat = -3.700852;
      this.lng = -38.586988;
      this.lat2 = -3.734680;
      this.lng2 = -38.469289;
      this.locationName = 'Shopping da Bezerra';
      this.marker1 = new LocationModel(1, 'Shopping da Bezerra', -3.700852, -38.586988, 0, new LocationTypeModel('teste'), null, null);
  }

  ngOnInit(): void {
  }

    push() {
    }

    pop() {
    }
}
