package ru.job4j.loop;

/**
 * @author Alexandr Sedykh
 * @version $Id$
 * @since 0.1
 */
public class Counter {
	/**
	  * Складывает сумму четных чисел в диапазоне.
	  * @param start, первое число диапазона.
	  * @param finish, последнее число диапазона.
	  * @return Сумма четных чисел.
	  */
	public int add(int start, int finish) {
		int i;
		int result = 0;
		for (i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}
		return result;
	}
}