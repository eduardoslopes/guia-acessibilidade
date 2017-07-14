/**
 * Created by marcosflavio on 6/7/17.
 */
import {Component, Input, ContentChildren, QueryList, OnDestroy, ViewChild} from '@angular/core';
import * as L from 'leaflet';
import { Marker } from '../marker/marker'
@Component({
    selector: 'leaflet-map',
    template: require('./map.html')
})
export class Map{
    @Input() lat: number = -3.723341;
    @Input() lng: number = -38.536207;
    @Input() zoom: number = 10;
    @Input() minZoom: number = 5;
    @Input() callback: Function;
    @Input() onemarker: boolean = true;
    @Input() width: string = '100%';
    @Input() height: string = '100%';

    @ViewChild('map')
    mapElement;

    map: L.Map;
    center: any;
    markers: L.LayerGroup;


    constructor() {
        this.markers = new L.LayerGroup([]);
    }

    ngOnInit() {
        this.center = [this.lat, this.lng];
        this.initMap();
        this.click();
    }

    click() {
        this.map.on('click', (ev: L.LocationEvent) => {
            if(this.callback != null){
                this.callback(ev);
                if(this.onemarker) {
                    this.createMarker(ev);
                } else {
                    //TODO allow n markers
                }
            }
        });
    }

    createMarker(ev: L.LocationEvent) {
        let myIcon = L.icon({
            iconUrl: require('./../../../../../assets/images/marker-icon.png'),
            shadowUrl: require('./../../../../../assets/images/marker-shadow.png')
        });
        let marker = L.marker([ev.latlng.lat, ev.latlng.lng], {icon: myIcon});
        this.addToLayer(marker);
    }

    addToLayer(marker: L.Marker) {
        this.map.removeLayer(this.markers);
        this.markers = new L.LayerGroup([]);
        this.markers.addLayer(marker);
        this.map.addLayer(this.markers);
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