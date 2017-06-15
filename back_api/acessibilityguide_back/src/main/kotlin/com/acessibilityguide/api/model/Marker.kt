package com.acessibilityguide.api.model

import com.avaje.ebean.Model
import javax.persistence.*

/**
 * Created by eduardolopes on 05/06/17.
 */
@Entity
@Table(name= "marker")
class Marker: Model() {

    @Id
    private var id: Long? = null
        get() = field;
        set(value) {field = value}

    private var name: String? = null
        get() = field;
        set(value) {field = value}

    private var description: String? = null
        get() = field;
        set(value) {field = value}

    private var latitude: Double? = null
        get() = field;
        set(value) {field = value}

    private var longitude: Double? = null
        get() = field;
        set(value) {field = value}

    @ManyToOne(optional = false)
    private var markerType: MarkerType? = null
        get() = field;
        set(value) {field = value}

    @ManyToOne(optional = false)
    private var user: GuideUser? = null
        get() = field;
        set(value) {field = value}

    @ManyToMany(mappedBy = "markers")
    private var acessibilityTypes: List<AcessibilityType>? = null
        get() = field;
        set(value) {field = value}
}