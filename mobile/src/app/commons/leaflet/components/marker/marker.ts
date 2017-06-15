/**
 * Created by marcosflavio on 6/7/17.
 */
import { Component, Input } from '@angular/core';
import * as L from 'leaflet';

@Component({
    selector: 'leaflet-marker',
    template: './marker.html'
})
export class Marker{
    @Input() lat: number = null;
    @Input() lng: number = null;
    @Input() onClick: any = undefined;
    @Input() iconUrl: string = '';
    marker: any = null;
    constructor() {
    }

    ngOnInit(){
        this.createMarker();
    }

    createMarker() {
        if(this.iconUrl === "") {
            this.marker = L.marker([this.lat, this.lng]);
        }else {
            let myIcon = L.icon({
                iconUrl: this.iconUrl,
                iconSize: [38, 95],
                iconAnchor: [22, 94],
                popupAnchor: [-3, -76],
                //shadowUrl: 'my-icon-shadow.png',
                //shadowSize: [68, 95],
                //shadowAnchor: [22, 94]
            });

            this.marker = L.marker([this.lat, this.lng], {icon: myIcon});
        }
    }

    addTo(map){
        this.marker.addTo(map);
    }

}