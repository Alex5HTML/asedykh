package ru.job4j.array;

    /**
     * @author Alexandr Sedykh
     * @version $Id$
     * @since 04.03.18
     */
public class CheckArrayChar {
	/**
     * Проверяет. что одно слово находится в другом слове.
     * @param origin оригинальное слово.
	 * @param sub внутреннее слово.
     * @return если слово находится в другом слове.
     */
	public boolean contains(String origin, String sub) {
		char[] originChar = origin.toCharArray();
		char[] subChar = sub.toCharArray();
		boolean result = false;
		for (int i = 0; i < subChar.length; i++) {
			for (int j = 0; j < originChar.length; j++) {
				if (subChar[i] == originChar[j]) {
					j++;
					result = true;
					break;
				} else {
					result = false;
				}
			}
			if (!result) {
				break;
			}
		}
		return result;
	}
}