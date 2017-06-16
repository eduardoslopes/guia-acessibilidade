package com.acessibilityguide.api.migrations;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.avaje.ebean.config.dbplatform.DbPlatformName;
import com.avaje.ebean.dbmigration.DbMigration;

@Component
public class MigrationGenerator {
	
	public void generate(String name, Double version) throws IOException{
		System.setProperty("ddl.migration.version", version+"");
	    System.setProperty("ddl.migration.name", name);
	    
	    DbMigration dbMigration = new DbMigration();
	    dbMigration.setPlatform(DbPlatformName.POSTGRES);
	    dbMigration.generateMigration();	    	    
	}
	
	public void generateForPendingDrops(Double version){
	    System.setProperty("ddl.migration.pendingDropsFor", version+"");

		DbMigration dbMigration = new DbMigration();
	    dbMigration.setPlatform(DbPlatformName.POSTGRES);
    	try {
			dbMigration.generateMigration();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
