package com.project_class.laho;


public class ProjectTest {
	
	public static void main(String[] args) {
			
		Project newTask = new Project();
		
		String blankPitch = newTask.elevatorPitch(null, null);
		newTask.setName("Sleepy");
		newTask.setDescription("ONe of the days");
		System.out.printf(blankPitch);
		
		System.out.println(newTask.elevatorPitch("deezz", "Lorem Ipsum"));
		
		
		//System.out.println(newTask.getDescription());
		//System.out.println(newTask.getName());
	}

}