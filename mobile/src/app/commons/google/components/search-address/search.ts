/**
 * Created by marcosflavio on 6/15/17.
 */
import { Component, Input, ContentChildren, QueryList } from '@angular/core';
@Component({
    selector: 'google-search',
    template: require('./search.html'),
})
export class Search {
    @Input() address: string = null;

    constructor() {
    }

    ngOnInit() {
    }
}