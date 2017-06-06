package com.acessibilityguide.api.config

import com.avaje.ebean.EbeanServer
import org.springframework.beans.factory.FactoryBean
import com.avaje.ebean.EbeanServerFactory
import com.avaje.ebean.springsupport.txn.SpringAwareJdbcTransactionManager
import com.avaje.ebean.config.ServerConfig
import org.springframework.beans.factory.annotation.Autowired
import javax.sql.DataSource


/**
 * Created by eduardolopes on 06/06/17.
 */

class EbeanFactoryBean: FactoryBean<EbeanServer> {

    @Autowired
    private val dataSource: DataSource? = null

    val MODELS_PACKAGE = "com.acessibilityguide.api.model"

    override fun getObject(): EbeanServer {
        val config = ServerConfig()
        config.name = "db"
        config.dataSource = dataSource

        config.externalTransactionManager = SpringAwareJdbcTransactionManager()
        config.loadFromProperties()

        config.isDefaultServer = true
        config.isRegister = true
        config.addPackage(MODELS_PACKAGE)

        return EbeanServerFactory.create(config)
    }

    override fun isSingleton(): Boolean {
        return true
    }

    override fun getObjectType(): Class<*> {
        return EbeanServer::class.java;
    }
}