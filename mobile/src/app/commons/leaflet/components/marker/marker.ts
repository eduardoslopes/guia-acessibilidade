/**
 * Created by marcosflavio on 6/7/17.
 */
import { Component, Input } from '@angular/core';
import * as L from 'leaflet';
import * as $ from "jquery";
import {
    ViewChild,
    Params,
    OnsNavigator,
    OnsenModule,
    NgModule,
    CUSTOM_ELEMENTS_SCHEMA
} from 'angular2-onsenui';

@Component({
    selector: 'leaflet-marker',
    template: './marker.html'
})
export class Marker{
    @Input() lat: number = null;
    @Input() lng: number = null;
    @Input() onClick: any = undefined;
    @Input() iconUrl: string = '';
    @Input() popup: boolean = false;
    @Input() locationname: string = '';
    @Input() callback: Function;
    popupContent: string = null;
    marker: any = null;

    constructor() {
    }

    ngOnInit(){
        this.createMarker();
    }

    createMarker() {
        if(this.iconUrl === "") {
            let myIcon = L.icon({
                iconUrl: require('./../../../../../assets/images/marker-icon.png'),
                shadowUrl: require('./../../../../../assets/images/marker-shadow.png')
            });

            this.marker = L.marker([this.lat, this.lng], {icon: myIcon});
        }else {
            let myIcon = L.icon({
                iconUrl: this.iconUrl,
                shadowUrl: require('./../../../../../assets/images/marker-shadow.png')
            });

            this.marker = L.marker([this.lat, this.lng], {icon: myIcon});
        }
        this.setPopupContent();
    }

    addTo(map){
        if(this.popup) {
            this.marker.addTo(map);
            this.marker.bindPopup(this.popupContent);
            map.on('popupopen', function () {
                $('.callbacklink').click(function() {
                    //TODO change the page
                    console.log("Evento de clique");
                });
            });
        } else {
            this.marker.addTo(map);
        }
    }

    setPopupContent() {
        this.popupContent =
            "<p>Local<br />"
                .concat(this.locationname)
                .concat( "</p>")
            .concat("<p>Latitude: ")
                .concat(this.lat.toString())
                .concat("</p>")
            .concat("<p>Longitude: ")
                .concat(this.lng.toString())
                .concat("</p>")
                .concat("<div class='callbacklink'>")
                .concat("<ons-button> Detalhes </ons-button>")
                .concat("</div>");
    }
}