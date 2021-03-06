package com.jrp.pma.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Project {
	
	//GeneratedValue(Strategy=GenerationType.AUTO) Is helping us mapping this object
	//to database tables. The @Id helps us generate a unique Id. This is because of the
	//persistence libraries which is part of the hibernate module of Spring.
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long projectId;
	private String name;
	private String stage; // NOTSTARTED, COMPLETED, INPROGRESS
	private String description;

	//The projectId is not part of the constructor. Since we work with a database
	//we want the database to assign a unique identifier to the project. 
	
	public Project() {
		
	}
	
	public Project(String name, String stage, String description) {
		super();
		this.name = name;
		this.stage = stage;
		this.description = description;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
