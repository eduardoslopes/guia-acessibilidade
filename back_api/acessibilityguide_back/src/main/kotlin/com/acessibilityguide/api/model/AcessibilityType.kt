package com.acessibilityguide.api.model

import com.avaje.ebean.Model
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.Table

/**
 * Created by eduardolopes on 05/06/17.
 */
@Entity
@Table(name= "acessibility_type")
class AcessibilityType: Model() {

    @Id
    private var id: Long? = null
        get() = field;
        set(value) {field = value}

    private var name: String? = null
        get() = field;
        set(value) {field = value}

    private var another: Boolean? = null
        get() = field;
        set(value) {field = value}

    @ManyToMany
    private var markers: List<Marker>? = null
        get() = field;
        set(value) {field = value}
}