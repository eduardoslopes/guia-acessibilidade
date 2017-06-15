package com.acessibilityguide.api.model

import com.avaje.ebean.Model
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by eduardolopes on 02/06/17.
 */

@Entity
@Table(name = "marker_type")
class MarkerType: Model() {

    @Id
    var id: Long? = null

    var name: String? = null

    companion object : Model.Find<Long, MarkerType>() { }
}