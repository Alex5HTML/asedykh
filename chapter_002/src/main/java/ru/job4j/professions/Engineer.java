package ru.job4j.professions;

public class Engineer extends Profession {
	
	public Engineer(String name, String profession) {
		this.name = name;
		this.profession = profession;
	}
	
	public Project build(Task task) {
		Project project = new Project("name");
		return project;
	}
}