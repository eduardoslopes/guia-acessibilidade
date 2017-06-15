package com.acessibilityguide.api.config

import java.io.IOException
import org.avaje.ebean.typequery.generator.Generator;
import org.avaje.ebean.typequery.generator.GeneratorConfig;


/**
 * Created by eduardolopes on 15/06/17.
 */
class QueryBeanGenerator

fun main(args: Array<String>) {

    val config = GeneratorConfig()
    //config.setClassesDirectory("./target/classes");
    //config.setDestDirectory("./src/main/java");
    //config.setDestResourceDirectory("./src/main/resources");

    config.setEntityBeanPackage("com.acessibilityguide.api.model")
    config.setDestPackage("com.acessibilityguide.api.model.query");

    config.setOverwriteExistingFinders(true);

    val generator = Generator(config)
    generator.generateQueryBeans()
    generator.generateFinders()

}

