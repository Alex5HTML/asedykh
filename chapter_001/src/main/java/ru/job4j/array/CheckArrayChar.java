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
		for (int out = 0; out < subChar.length; out++) {
			for (int in = 0; in < originChar.length; in++) {
				if (subChar[out] == originChar[in]) {
					in++;
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