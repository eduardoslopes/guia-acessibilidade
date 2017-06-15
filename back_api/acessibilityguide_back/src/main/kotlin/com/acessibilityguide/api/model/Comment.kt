package com.acessibilityguide.api.model

import com.avaje.ebean.Model
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

/**
 * Created by eduardolopes on 15/06/17.
 */

@Entity
@Table(name = "comment")
class Comment {

    @Id
    var id: Long? = null

    var content: String? = null

    @JsonIgnore
    @ManyToOne(optional = false)
    var marker: Marker? = null

    @ManyToOne(optional = false)
    var user: GuideUser? = null

    companion object : Model.Find<Long, Comment>() { }


}