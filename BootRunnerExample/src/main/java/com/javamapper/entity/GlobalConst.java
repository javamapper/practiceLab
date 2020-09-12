package com.javamapper.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my")
@PropertySource("classpath:global.properties")
public class GlobalConst {
	private String email;
	private String devName;
	@Override
	public String toString() {
		return "GlobalConst [email=" + email + ", devName=" + devName + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
}
