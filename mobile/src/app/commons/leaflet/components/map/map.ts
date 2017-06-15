/**
 * Created by marcosflavio on 6/7/17.
 */
import { Component, Input, ContentChildren, QueryList } from '@angular/core';
import * as L from 'leaflet';
import { Marker } from '../marker/marker'
@Component({
    selector: 'leaflet-map',
    template: require('./map.html'),
})
export class Map {
    @Input() lat: number = -3.700852;
    @Input() lng: number = -38.586988;
    @Input() zoom: number = 13;
    map: L.Map;
    center: any;

    constructor() {
    }

    ngOnInit() {
        this.center = [this.lat, this.lng];
        this.initMap();
    }

    initMap() {
        this.map = L.map('map', {
            center: this.center,
            zoom: this.zoom,
            closePopupOnClick: false,
            attributionControl: false
        });

        this.addTileLayer();
    }

    addTileLayer() {
        L.tileLayer("http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png")
            .addTo(this.map);
    }

    @ContentChildren(Marker)
    set _markers(markers: QueryList<Marker>) {
        if(markers){
            markers.forEach(marker => {
                marker.addTo(this.map);
            });
        }
    }

}