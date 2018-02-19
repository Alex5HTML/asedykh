package ru.job4j.calculator;

/**
 * Конвертор валюты.
 */
 public class Converter {
	 
	 private static final int EURO = 70;
	 private static final int DOLLAR = 60;
	 /**
	  * Конвертируем рубли в евро.
	  * @param value рубли.
	  * @return Евро.
	  */
	public int rubleToEuro(int value) {
		int result = value / EURO;
		return result;
	}
	
	/**
	 * Конвертируем рубли в доллары.
	 * @param value рубли.
	 * @return Доллоры.
	 */
	public int rubleToDollar(int value) {
		int result = value / DOLLAR;
		return result;
	}
	
	/**
	 * Конвертируем евро в рубли.
	 * @param value евро.
	 * @return рубли.
	 */
	public int euroToRuble(int value) {
		int result = value * EURO;
		return result;
	}
	
	/**
	 * Конвертируем доллары в рубли.
	 * @param value доллары.
	 * @return рубли.
	 */
	public int dollarToRuble(int value) {
		int result = value * DOLLAR;
		return result;
	}	
 }	
	