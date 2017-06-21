/**
 * Created by marcosflavio on 6/7/17.
 */
import {Component, Input, ContentChildren, QueryList, OnDestroy, ViewChild} from '@angular/core';
import * as L from 'leaflet';
import { Marker } from '../marker/marker'
import {OnsNavigator} from "angular2-onsenui";
@Component({
    selector: 'leaflet-map',
    template: require('./map.html')
})
export class Map{
    @Input() lat: number = -3.700852;
    @Input() lng: number = -38.586988;
    @Input() zoom: number = 13;
    @Input() minZoom: number = 5;

    @ViewChild('map')
    mapElement;

    map: L.Map;
    center: any;

    constructor() {
    }

    ngOnInit() {
        this.center = [this.lat, this.lng];
        this.initMap();
    }

    initMap() {
        this.map = L.map(this.mapElement.nativeElement, {
            center: this.center,
            zoom: this.zoom,
            minZoom: this.minZoom,
            worldCopyJump: true,
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
                if(marker.marker){
                    marker.addTo(this.map);
                }
            });
        }
    }

}