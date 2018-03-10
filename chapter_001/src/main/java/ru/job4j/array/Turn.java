package ru.job4j.array;

    /**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 27.02.18
     */
public class Turn {
	 /**
	  * Переворачивает массив.
	  * @param .
	  * @return Перевернутый массив.
	  */
	public int[] back(int[] array) {
		for (int index = 0; index < array.length / 2; index++) {
		    int temp = array[index];
			array[index] = array[array.length - 1 - index];
			array[array.length - 1 - index] = temp;
		}
		return array;
	}
}