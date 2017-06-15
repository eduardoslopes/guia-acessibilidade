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
    var id: Long? = null

    var name: String? = null

    var another: Boolean? = null

    @ManyToMany
    var markers: List<Marker>? = null

    companion object : Model.Find<Long, AcessibilityType>() { }

}