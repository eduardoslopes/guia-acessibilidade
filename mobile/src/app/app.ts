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
  constructor() {
      this.lat = -3.700852;
      this.lng = -38.586988;
      this.lat2 = -3.734680;
      this.lng2 = -38.469289;
      this.locationName = 'Shopping da Bezerra';
  }

  ngOnInit(): void {}

    push() {
    }

    pop() {
    }
}
