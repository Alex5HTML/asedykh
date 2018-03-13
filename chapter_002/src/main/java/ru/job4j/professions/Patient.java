package ru.job4j.professions;

public class Patient extends Profession {

	public String complaint;
	
	public Patient(String name, String complaint) {
		this.name = name;
		this.complaint = complaint;
	}
}