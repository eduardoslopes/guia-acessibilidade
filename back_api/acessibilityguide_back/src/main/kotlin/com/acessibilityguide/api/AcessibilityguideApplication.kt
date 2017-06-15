package com.acessibilityguide.api

import com.acessibilityguide.api.migrations.MigrationAutomagicRunner
import com.acessibilityguide.api.migrations.MigrationGenerator
import com.acessibilityguide.api.model.Marker
import com.acessibilityguide.api.model.finder.MarkerTypeFinder
import com.acessibilityguide.api.model.query.QMarker
import com.avaje.ebean.EbeanServer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class AcessibilityguideApplication: CommandLineRunner{

    @Autowired
    lateinit var server: EbeanServer

    @Autowired
    lateinit var migrationGenerator: MigrationGenerator

    @Autowired
    lateinit var migrationRunner: MigrationAutomagicRunner

    override fun run(vararg p0: String?) {
//        migrationGenerator.generate("creation of comments", 1.01)
        migrationRunner.run();

    }
}

fun main(args: Array<String>) {
    SpringApplication.run(AcessibilityguideApplication::class.java, *args)
}


