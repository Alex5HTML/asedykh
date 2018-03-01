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
		for (int i = 0; i < array.length / 2; i++) {
		    int tm = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tm;
		}
		return array;
	}
}