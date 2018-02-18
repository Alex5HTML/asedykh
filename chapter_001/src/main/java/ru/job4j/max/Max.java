package ru.job4j.max;

/**
 * @author Alexandr Sedykh
 * @version $Id$
 * @since 0.1
 */
public class Max {
	/**
	  * Сравнивает два числа.
	  * @param first, second сравниваемые числа.
	  * @return Наибольшее число.
	  */
	public int max(int first, int second) {
		return first > second ? first : second;	
	}
}