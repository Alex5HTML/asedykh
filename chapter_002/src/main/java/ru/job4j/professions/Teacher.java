package ru.job4j.professions;

public class Teacher extends Profession {
	
	public Teacher(String name, String profession) {
		this.name = name;
		this.profession = profession;
	}
	
	public Subject teach(Pupil pupil) {
		Subject subject = new Subject("name");
		return subject;
	}
}