package com.javamapper.entity;

import java.util.List;

public class Project {

	private String projectName;
	private List<String> skillNames;
	private int teamSize;
	private String startDate;
	private String endDate;

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", skillNames=" + skillNames + ", teamSize=" + teamSize
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<String> getSkillNames() {
		return skillNames;
	}

	public void setSkillNames(List<String> skillNames) {
		this.skillNames = skillNames;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
