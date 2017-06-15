package com.acessibilityguide.api.model

import com.avaje.ebean.Model
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by eduardolopes on 02/06/17.
 */
@Entity
@Table(name= "guide_user")
class GuideUser: Model() {

    @Id
    var id: Long? = null

    var name: String? = null

    @Column(nullable = false, unique = true)
    var cpf: String? = null

    @Column(nullable = false, unique = true)
    var username: String? = null

    @Column(nullable = false)
    var password: String? = null

    companion object : Model.Find<Long, GuideUser>() { }

}