package ru.job4j.pseudo;

public class Square implements Shape {
	@Override
	public String pic() {
		StringBuilder picture = new StringBuilder();
		picture.append("+ + + +");
		picture.append(System.lineSeparator());
		picture.append("+     +");
        picture.append(System.lineSeparator());
		picture.append("+     +");
        picture.append(System.lineSeparator());
		picture.append("+ + + +");
		return picture.toString();
	}
}