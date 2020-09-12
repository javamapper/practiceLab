package com.javamapper.entity;

import org.springframework.stereotype.Component;

@Component
public class Skill {


	private String skillName;
	private String lastUsedDate;
	private int experienceInSkill;
	private String ratingInSkill;
	private boolean projectsUsedSkill;
	private String depthUsedSkillRating;

	public Skill() {
		
	}

	public Skill(String skillName, String lastUsedDate, int experienceInSkill, String ratingInSkill,
			Boolean projectsUsedSkill, String depthUsedSkillRating) {
		super();
		this.skillName = skillName;
		this.lastUsedDate = lastUsedDate;
		this.experienceInSkill = experienceInSkill;
		this.ratingInSkill = ratingInSkill;
		this.projectsUsedSkill = projectsUsedSkill;
		this.depthUsedSkillRating = depthUsedSkillRating;
	}
	
	@Override
	public String toString() {
		return "Skill [skillName=" + skillName + ", lastUsedDate=" + lastUsedDate + ", experienceInSkill="
				+ experienceInSkill + ", ratingInSkill=" + ratingInSkill + ", projectsUsedSkill=" + projectsUsedSkill
				+ ", depthUsedSkillRating=" + depthUsedSkillRating + "]";
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getLastUsedDate() {
		return lastUsedDate;
	}

	public void setLastUsedDate(String lastUsedDate) {
		this.lastUsedDate = lastUsedDate;
	}

	public int getExperienceInSkill() {
		return experienceInSkill;
	}

	public void setExperienceInSkill(int experienceInSkill) {
		this.experienceInSkill = experienceInSkill;
	}

	public String getRatingInSkill() {
		return ratingInSkill;
	}

	public void setRatingInSkill(String ratingInSkill) {
		this.ratingInSkill = ratingInSkill;
	}

	public boolean getProjectsUsedSkill() {
		return projectsUsedSkill;
	}

	public void setProjectsUsedSkill(Boolean projectsUsedSkill) {
		this.projectsUsedSkill = projectsUsedSkill;
	}

	public String getDepthUsedSkillRating() {
		return depthUsedSkillRating;
	}

	public void setDepthUsedSkillRating(String depthUsedSkillRating) {
		this.depthUsedSkillRating = depthUsedSkillRating;
	}

}
