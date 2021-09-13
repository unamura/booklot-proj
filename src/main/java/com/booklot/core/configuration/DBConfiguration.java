package com.booklot.core.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring")
//@SuppressWarnings("unused")
public class DBConfiguration {

	//private String driverClassName;
	private String url;
	private String username;
	private String password;
	private String port;

	@Profile("dev")
	@Bean
	public String devDatabaseConnection() {
		System.out.println("DB connection for DEV - PostgreSQL");
		System.out.println(url);
		System.out.println(port);
		System.out.println("PostgreSQL username is: " + username);
		System.out.println("PostgreSQL password is: " + password);
		return "DB connection for DEV - PostgreSQL";
	}
	
	@Profile("!dev")
	@Bean
	public String regularDatabaseConnection() {
		System.out.println("This will print if is not a dev profile ");
		return null;
	}
}
