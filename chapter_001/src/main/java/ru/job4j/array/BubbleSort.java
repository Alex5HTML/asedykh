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
		for (int i = 0; i < array.length; i++) {
			for (int x = 0; x < array.length - 1; x++) {
				if (array[x] > array[x + 1]) {
					int tmp = array[x];
					array[x] = array[x + 1];
					array[x + 1] = tmp;
				}
			}
		}
		return array;
	}
}