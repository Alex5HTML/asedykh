package ru.job4j.calculator;

/**
 * Конвертор валюты.
 */
 public class Converter {
	 
	 public final int euroMult = 70;
	 public final int dollarMult = 60;
	 /**
	  * Конвертируем рубли в евро.
	  * @param value рубли.
	  * @return Евро.
	  */
	public int rubleToEuro(int value) {
		int result = value / euroMult;
		return result;
	}
	
	/**
	 * Конвертируем рубли в доллары.
	 * @param value рубли.
	 * @return Доллоры.
	 */
	public int rubleToDollar(int value) {
		int result = value / dollarMult;
		return result;
	}
	
	/**
	 * Конвертируем евро в рубли.
	 * @param value евро.
	 * @return рубли.
	 */
	public int euroToRuble(int value) {
		int result = value * euroMult;
		return result;
	}
	
	/**
	 * Конвертируем доллары в рубли.
	 * @param value доллары.
	 * @return рубли.
	 */
	public int dollarToRuble(int value) {
		int result = value * dollarMult;
		return result;
	}	
 }	
	