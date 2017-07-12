package com.acessibilityguide.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.acessibilityguide.api.migrations.MigrationAutomaticRunner;
import com.acessibilityguide.api.migrations.MigrationGenerator;
import com.avaje.ebean.EbeanServer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class AcessibilityguideApplication implements CommandLineRunner {

	@Autowired
	private EbeanServer server;
	
	@Autowired
	private MigrationAutomaticRunner migrationRunner;
	
	@Autowired
	private MigrationGenerator mingrationGenerator;
	
	public static void main(String[] args) {
		SpringApplication.run(AcessibilityguideApplication.class, args);
	}

	@Bean
	public Docket smartxApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Acessibility Guide")
				.apiInfo(apiInfo())
				.select()
				.paths(PathSelectors.regex("/.*"))
				.build();
				
	}
	
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
				.title("Acessibility Guide API")
				.description("Acessibility Guide API specification")
				.termsOfServiceUrl("")
				.contact("Acessibility Guide")
				.license("")
				.licenseUrl("")
				.version("1.0.0")
				.build();
	}	

	@Override
	public void run(String... arg0) throws Exception {
//		mingrationGenerator.generate("add_votes_type", 1.06);
//		mingrationGenerator.generateForPendingDrops(1.02);
		migrationRunner.run();
	}
}
