package ru.job4j.array;

/**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 01.03.18
     */
public class BubbleSort {
	/**
	  * Переворачивает массив.
	  * @return Перевернутый массив.
	  */
	public int[] sort(int[] array) {
		for (int out = 0; out < array.length; out++) {
			for (int in = 0; in < array.length - 1; in++) {
				if (array[in] > array[in + 1]) {
					int tmp = array[in];
					array[in] = array[in + 1];
					array[in + 1] = tmp;
				}
			}
		}
		return array;
	}
}