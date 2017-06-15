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
    }

    addTo(map){
        this.marker.addTo(map);
    }

}