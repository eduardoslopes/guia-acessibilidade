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
    private var id: Long? = null
        get() = field;
        set(value) {field = value}

    private var name: String? = null
        get() = field;
        set(value) {field = value}

}