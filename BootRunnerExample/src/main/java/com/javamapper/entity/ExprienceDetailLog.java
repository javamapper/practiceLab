package com.javamapper.entity;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExprienceDetailLog {
	private String skillExpertice;
	public String getSkillExpertice() {
		return skillExpertice;
	}
	public void setSkillExpertice(String skillExpertice) {
		this.skillExpertice = skillExpertice;
	}

	private List<Skill> skills;
	private Map<String, Project> projectWithDetail;

	public ExprienceDetailLog() {  
	}
	@Autowired
	public ExprienceDetailLog(List<Skill> skillWithDetails, Map<String, Project> projectWithDetail) {
		super();
		this.skills = skillWithDetails;
		this.projectWithDetail = projectWithDetail;
	}

 

	@Override
	public String toString() {
		return "ExprienceDetailLog [skillExpertice=" + skillExpertice + ", skills=" + skills + ", projectWithDetail="
				+ projectWithDetail + "]";
	}
	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public Map<String, Project> getProjectWithDetail() {
		return projectWithDetail;
	}

	public void setProjectWithDetail(Map<String, Project> projectWithDetail) {
		this.projectWithDetail = projectWithDetail;
	}
}
