package com.acessibilityguide.api.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.EbeanServerFactory;
import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.springsupport.txn.SpringAwareJdbcTransactionManager;

@Component
public class EbeanFactoryBean implements FactoryBean<EbeanServer> {

	@Autowired
	private DataSource dataSource;
	
	public final static String MODELS_PACKAGE="com.acessibilityguide.api.model";
	
	@Override
	public EbeanServer getObject() throws Exception {
		ServerConfig config = new ServerConfig();
		config.setName("duo_db");
		config.setDataSource(dataSource);
		
		config.setExternalTransactionManager(new SpringAwareJdbcTransactionManager());
		config.loadFromProperties();
		
		config.setDefaultServer(true);
		config.setRegister(true);
		config.addPackage(MODELS_PACKAGE);		
		
		return EbeanServerFactory.create(config);
	}

	@Override
	public Class<?> getObjectType() {
		return EbeanServer.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
	
}
