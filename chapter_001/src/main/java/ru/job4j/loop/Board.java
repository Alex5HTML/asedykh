package ru.job4j.loop;

/**
 * @author Alexandr Sedykh
 * @version $Id$
 * @since 0.1
 */
public class Board {
	/**
	  * Строит шахматную доску.
	  * @param width, ширина доски.
	  * @param height, высота доски.
	  */
	public String paint(int width, int height) {
		StringBuilder screen = new StringBuilder();
		String ln = System.lineSeparator();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((i + j) % 2 == 0 || i + j == 0) {
					screen.append("x");
				} else {
					screen.append(" ");
				}
			}
			screen.append(ln);
		}
		return screen.toString();
	}
}