/**
 * Created by marcosflavio on 6/7/17.
 */
import {Component, Input, Output, EventEmitter} from '@angular/core';
import * as L from 'leaflet';
import * as $ from "jquery";
import {
    OnsNavigator,
    CUSTOM_ELEMENTS_SCHEMA
} from 'angular2-onsenui';
import {LocationModel} from "../../../models/location";
import {AccessibleLocationService} from "../../../../accessible-location/services/accessible-location.service";
import {ACCESSIBLELOCATION} from "../../../../accessible-location/constants/accessible-location.constants";
import {VoteDTO} from "../../../models/VoteDTO";

@Component({
    selector: 'leaflet-marker',
    template: './marker.html'
})
export class Marker{
    @Input() onClick: any = undefined;
    @Input() iconUrl: string = '';
    @Input() popup: boolean = false;
    @Input() callback: Function;
    popupContent: string = null;
    @Input() location: LocationModel;
    marker: any;
    @Output() onVote: EventEmitter<VoteDTO> = new EventEmitter<VoteDTO>()


    constructor(private _navigator: OnsNavigator, private accessibleLocationService : AccessibleLocationService) {
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

            this.marker = L.marker([this.location.latitude, this.location.longitude], {icon: myIcon});
        }else {
            let myIcon = L.icon({
                iconUrl: this.iconUrl,
                shadowUrl: require('./../../../../../assets/images/marker-shadow.png')
            });

            this.marker = L.marker([this.location.latitude, this.location.longitude], {icon: myIcon});
        }
        this.setPopupContent();
    }

    addTo(map){
        if(this.popup) {
            this.marker.addTo(map);
            this.marker.bindPopup(this.popupContent);
            map.on('popupopen', () => {
                $('.voteup').click(() => {
                    this.sendVote('UP');
                });
                $('.votedown').click(() => {
                    this.sendVote('DOWN');
                });
            });
        } else {
            this.marker.addTo(map);
        }
    }

    sendVote(voteType){
        let vote = new VoteDTO(this.location.id, voteType);
        this.onVote.emit(vote);
    }

    setPopupContent() {
        this.popupContent =
            `<ons-row>
                <ons-col>
                    <div style='margin: 0px'>
                        <div><ons-button modifier="quiet" class="voteup"> <ons-icon icon="caret-up" style="color: black; padding: 0px"> </ons-icon> </ons-button></div>
                        <div style="padding-left: 16px; padding-right: 16px">` + this.location.votes + `</div>
                        <div><ons-button modifier="quiet" class="votedown"> <ons-icon icon="caret-down" style="color: black; padding: 0px"> </ons-icon> </ons-button></div>
                    </div>
                </ons-col>
                <ons-col>
                    <p>
                        ` + this.location.name  + `
                    </p>
                </ons-col>
            </ons-row>
            <div><label>Tipo local: </label> ` + this.location.markerType.name + ` </div>
            <ons-row>
                <ons-col> <label>Acessibilidades: </label> </ons-col>
                <ons-col> 
                    <div *ngFor="let acessibilityType of location.accessibilityTypes"></div>
                </ons-col>
            </ons-row>
            <div><label>Latitude: </label>` + this.location.latitude + `</div>
            <div><label>Longitude: </label>`+ this.location.longitude + `</div>`

    }
}