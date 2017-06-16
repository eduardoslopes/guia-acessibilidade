package com.acessibilityguide.api.migrations;


import org.avaje.dbmigration.MigrationConfig;
import org.avaje.dbmigration.MigrationRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MigrationAutomaticRunner {

	@Autowired
	private Environment environment;
	
	public void run(){
		
		String username = environment.getProperty("spring.datasource.username");
		String password = environment.getProperty("spring.datasource.password");
		String driver = environment.getProperty("datasource.db.databaseDriver");
		String url = environment.getProperty("spring.datasource.url");
		
		MigrationConfig config = new MigrationConfig();
		config.setDbUsername(username);
		config.setDbPassword(password);
		config.setDbDriver(driver);
		config.setDbUrl(url);
		
		MigrationRunner mr = new MigrationRunner(config);
		mr.run();
	}
	
}
