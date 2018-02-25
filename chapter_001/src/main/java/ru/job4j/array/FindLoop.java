package ru.job4j.array;

	/**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 25.02.18
     */
public class FindLoop {
	/**
	  * Ищет индекс элемента, удовлетворяющий условию.
	  * @param el, условие посика.
	  * @return Индекс необходимого элемента.
	  */
	public int indexOf(int[] data, int el) {
		int result = -1;
		for (int index : data) {
			if (data[index] == el) {
				result = index;
				break;
			}
		}
		return result;
	}
}
