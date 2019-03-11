package com.javatest.myjavatest.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="com.javatest.myjavatest.opensource")
@PropertySource(value="classpath:resource.properties")
public class Resource {
	private String language;
	
	public String getLanguage() {
		return this.language;
	}
	
	public void setLanguage(String language) {
		this.language = language; 
	}
}
