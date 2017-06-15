import {Component} from '@angular/core';
import {onsNotification} from 'angular2-onsenui';

@Component({
  selector: 'app',
  template: require('./app.html'),
  styles: [require('./app.css')]
})
export class MyApp {
  lat: number;
  lng: number;
  lat2: number;
  lng2: number;

  constructor() {
      this.lat = -3.700852;
      this.lng = -38.586988;
      this.lat2 = -3.734680;
      this.lng2 = -38.469289;
  }

  ngOnInit(): void {}
}
