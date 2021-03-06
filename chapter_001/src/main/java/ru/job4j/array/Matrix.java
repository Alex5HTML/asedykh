package ru.job4j.array;

    /**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 01.03.18
     */
public class Matrix {
	/**
	  * Рисует таблицу умножения.
	  * @param size размер таблицы.
	  * @return Матрица - таблица умножения.
	  */
	public int[][] multiple(int size) {
		int i = 0;
		int j = 0;
		int[][] array = new int[size][size];
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				array[i][j] = (i + 1) * (j + 1);
			}
		}
		return array;
	}		
}		