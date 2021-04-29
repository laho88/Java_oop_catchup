package com.project_class.laho;


public class Project {
	
	private String name;
	private String description;
	
	//Constructor here - note: constructor names match the class:
	public Project() {
		
	}
	
	public Project(String name) {
		this.name = name;
	}
	
	public Project(String name, String description) {
		
	}
	
	public String elevatorPitch(String name, String description) {
//		return (this.name) + " : " + (this.description);
		this.name = name;
		this.description = description;
		//return (System.out.printf("%s : %s", name, description));
		return name + ": " + description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
