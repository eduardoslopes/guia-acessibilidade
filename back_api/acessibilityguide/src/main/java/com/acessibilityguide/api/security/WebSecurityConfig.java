package com.acessibilityguide.api.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and()
			.authorizeRequests()
				.antMatchers("/api/*").authenticated()
			.and()
				.authorizeRequests()
				.antMatchers("/auth/*").permitAll()
			.and()
				.authorizeRequests()
				.antMatchers(HttpMethod.GET, "/api/*").permitAll()
			.and().csrf().disable();
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
	}
	
	
}
