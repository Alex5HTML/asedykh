package ru.job4j.loop;

/**
 * @author Alexandr Sedykh
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
	/**
	  * Вычилсяет факториал.
	  * @param n, число, для которого вычисляется факториал.
	  * @return Факториал.
	  */
	public int calc(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}