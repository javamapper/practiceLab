package com.javamapper.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("dev.detail")
public class Developer {
	private String devName;
	private int devRating;
	private int experience;
	private String devSSOID;
	private String emailId;
	private String designation;
	@Autowired
	private ExprienceDetailLog exprienceDetailLog;

	@Override
	public String toString() {
		return "Developer [devName=" + devName + ", devRating=" + devRating + ", experience=" + experience
				+ ", devSSOID=" + devSSOID + ", emailId=" + emailId + ", designation=" + designation + ", skills="
				+ exprienceDetailLog + "]";
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public int getDevRating() {
		return devRating;
	}

	public void setDevRating(int devRating) {
		this.devRating = devRating;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getDevSSOID() {
		return devSSOID;
	}

	public void setDevSSOID(String devSSOID) {
		this.devSSOID = devSSOID;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public ExprienceDetailLog getExprienceDetailLog() {
		return exprienceDetailLog;
	}

	public void setExprienceDetailLogs(ExprienceDetailLog skills) {
		this.exprienceDetailLog = skills;
	}
}
