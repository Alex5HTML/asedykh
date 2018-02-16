package ru.job4j.calculator;

/**
 * Конвертор валюты.
 */
 public class Converter {
	 
	 /**
	  * Конвертируем рубли в евро.
	  * @param value рубли.
	  * @return Евро.
	  */
	public int rubleToEuro(int value) {
		int mult = 70;
		int result = value / mult;
		return result;
	}
	
	/**
	 * Конвертируем рубли в доллары.
	 * @param value рубли.
	 * @return Доллоры.
	 */
	public int rubleToDollar(int value) {
		int mult = 60;
		int result = value / mult;
		return result;
	}
	
	/**
	 * Конвертируем евро в рубли.
	 * @param value евро.
	 * @return рубли.
	 */
	public int euroToRuble(int value) {
		int mult = 70;
		int result = value * mult;
		return result;
	}
	
	/**
	 * Конвертируем доллары в рубли.
	 * @param value доллары.
	 * @return рубли.
	 */
	public int dollarToRuble(int value) {
		int mult = 60;
		int result = value * mult;
		return result;
	}	
 }	
	