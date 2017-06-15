package com.acessibilityguide.api

import com.avaje.ebean.EbeanServer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class AcessibilityguideApplication{

    @Autowired
    lateinit var server: EbeanServer
}
fun main(args: Array<String>) {
    SpringApplication.run(AcessibilityguideApplication::class.java, *args)
}


