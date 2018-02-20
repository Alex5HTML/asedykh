package ru.job4j.calculator;

public class Fit {
	
	private static final double COEFFICIENT = 1.15;
	private static final int MAN_FACTOR = 100;
	private static final int WOMAN_FACTOR = 110;
	/**
	 *Идеальный вес для мужщины.
	 * @param height Рост.
	 * @return идеальный вес.
	 */
	 double manWeight(double height) {
		 return (height - MAN_FACTOR) * COEFFICIENT;
	 }	

	/**
	 * Идеальный вес для женщины.
	 * @param height Рост.
	 * @return идеальный вес.
	 */
	 double womanWeight(double height) {
		 return (height - WOMAN_FACTOR) * COEFFICIENT;
	 }	
}	