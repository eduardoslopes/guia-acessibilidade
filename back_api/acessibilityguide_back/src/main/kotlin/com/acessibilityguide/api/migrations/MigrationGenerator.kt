package com.acessibilityguide.api.migrations

import org.springframework.stereotype.Component
import java.io.IOException
import com.avaje.ebean.config.dbplatform.DbPlatformName
import com.avaje.ebean.dbmigration.DbMigration



/**
 * Created by eduardolopes on 15/06/17.
 */
@Component
class MigrationGenerator {

    @Throws(IOException::class)
    fun generate(name: String, version: Double?) {
        System.setProperty("ddl.migration.version", version!!.toString() + "")
        System.setProperty("ddl.migration.name", name)

        val dbMigration = DbMigration()
        dbMigration.setPlatform(DbPlatformName.POSTGRES)
        dbMigration.generateMigration()
    }

    fun generateForPendingDrops(version: Double?) {
        System.setProperty("ddl.migration.pendingDropsFor", version!!.toString() + "")

        val dbMigration = DbMigration()
        dbMigration.setPlatform(DbPlatformName.POSTGRES)
        try {
            dbMigration.generateMigration()
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }


}