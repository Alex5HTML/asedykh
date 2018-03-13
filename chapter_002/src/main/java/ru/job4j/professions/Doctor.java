package ru.job4j.professions;

public class Doctor extends Profession {
	
	public Doctor(String name, String profession) {
		this.name = name;
		this.profession = profession;
	}
	
	public Diagnose heal(Patient patient) {
		Diagnose disease = new Diagnose("name");
		return disease;
	}
}