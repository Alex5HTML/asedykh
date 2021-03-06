package ru.job4j.tracker;

public class StubInput implements Input {
	
	private final String[] value;
	private int position = 0;
	
	public StubInput(final String[] value) {
		this.value = value;
	}
	
	public String ask(String question) {
		return this.value[this.position++];
	}
}