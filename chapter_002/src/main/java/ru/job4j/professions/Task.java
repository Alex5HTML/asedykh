package ru.job4j.professions;

public class Task extends Profession {

	public String description;
	
	public Task(String name, String description) {
		this.name = name;
		this.description = description;
	}
}