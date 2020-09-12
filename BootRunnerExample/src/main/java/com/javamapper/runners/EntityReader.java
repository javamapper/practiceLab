package com.javamapper.runners;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component 
@ConfigurationProperties(prefix="entity.data")
public class EntityReader {
	private String developerId;
	private String developerName;
	private String belongingProject;
	private boolean isActive;
	private char developerGrade;
	private List<String> entityNames;
	private Map<String,String> entityColumns;
//	private Set<String> entitySet;
//	private Map<String,String> entityMap;
//	private String[] entityArr;

	@Override
	public String toString() {
		return "EntityReader [developerId=" + developerId + ", developerName=" + developerName + ", belongingProject="
				+ belongingProject + ", isActive=" + isActive + ", developerGrade=" + developerGrade + ", entityNames="
				+ entityNames + ", entityColumns=" + entityColumns + "]";
	}
	public String getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public String getBelongingProject() {
		return belongingProject;
	}
	public void setBelongingProject(String belongingProject) {
		this.belongingProject = belongingProject;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getDeveloperGrade() {
		return developerGrade;
	}
	public void setDeveloperGrade(char developerGrade) {
		this.developerGrade = developerGrade;
	}
	public List<String> getEntityNames() {
		return entityNames;
	}
	public void setEntityNames(List<String> entityNames) {
		this.entityNames = entityNames;
	}
	public Map<String, String> getEntityColumns() {
		return entityColumns;
	}
	public void setEntityColumns(Map<String, String> entityColumns) {
		this.entityColumns = entityColumns;
	}
	
}
