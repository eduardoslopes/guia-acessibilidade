package com.acessibilityguide.api.migrations

import org.springframework.stereotype.Component
import org.avaje.dbmigration.MigrationRunner
import org.avaje.dbmigration.MigrationConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment


/**
 * Created by eduardolopes on 15/06/17.
 */

@Component
class MigrationAutomagicRunner {

    @Autowired
    private val environment: Environment? = null

    fun run() {

        val username = environment!!.getProperty("spring.datasource.username")
        val password = environment!!.getProperty("spring.datasource.password")
        val driver = environment!!.getProperty("datasource.db.databaseDriver")
        val url = environment!!.getProperty("spring.datasource.url")

        val config = MigrationConfig()
        config.dbUsername = username
        config.dbPassword = password
        config.dbDriver = driver
        config.dbUrl = url

        val mr = MigrationRunner(config)
        mr.run()
    }

}