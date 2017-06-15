import {Component} from '@angular/core';

@Component({
  selector: 'app',
  template: require('./app.html'),
  styles: [require('./../assets/leaflet.css').toString()]
})
export class MyApp {
  lat: number;
  lng: number;
  lat2: number;
  lng2: number;
  popupContent: string;
  constructor() {
      this.lat = -3.700852;
      this.lng = -38.586988;
      this.lat2 = -3.734680;
      this.lng2 = -38.469289;
      this.popupContent = "<p>Olá!<br />Este é o Guia acessibilidade!!.</p>";
  }

  ngOnInit(): void {}

  callNewMarkerPage(): void {
    //TODO call a page to register new accessible point
  }
}
