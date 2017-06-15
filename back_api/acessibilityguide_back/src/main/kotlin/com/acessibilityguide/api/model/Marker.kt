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
    var id: Long? = null

    var name: String? = null

    var description: String? = null

    var latitude: Double? = null

    var longitude: Double? = null

    @ManyToOne(optional = false)
    var markerType: MarkerType? = null

    @ManyToOne(optional = false)
    var user: GuideUser? = null

    @OneToMany(mappedBy = "marker")
    var comments: List<Comment>? = null

    @ManyToMany(mappedBy = "markers")
    var acessibilityTypes: List<AcessibilityType>? = null

    companion object : Model.Find<Long, Marker>() { }

}