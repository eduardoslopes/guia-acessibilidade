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
    private var id: Long? = null
        get() = field;
        set(id) {field = id;}

    private var name: String? = null
        get() = field;
        set(value) {field = value}

    @Column(nullable = false, unique = true)
    private var cpf: String? = null
        get() = field;
        set(value) {field = value}

    @Column(nullable = false, unique = true)
    private var username: String? = null
        get() = field;
        set(value) {field = value}

    @Column(nullable = false)
    private var password: String? = null
        get() = field;
        set(value) {field = value}

}