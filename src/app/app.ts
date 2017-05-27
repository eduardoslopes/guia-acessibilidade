import {Component} from '@angular/core';
import {onsNotification} from 'angular2-onsenui';

@Component({
  selector: 'app',
  template: require('./app.html'),
  styles: [require('./app.css')]
})
export class MyApp {
  constructor() {}

  alert() {
    onsNotification.alert('This is an Onsen UI alert notification test.');
  }
}
