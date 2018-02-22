package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Alexandr Sedykh
 * @version $Id$
 * @since 0.1
 */
 public class BoardTest {
	 @Test
	 public void whenPaintBoardWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
		 Board board = new Board();
		 String result = board.paint(3, 3);
		 final String line = System.lineSeparator();
		 String expected = String.format("x x%s x %sx x%s", line, line, line);
		 assertThat(result, is(expected));
	 }
	 
	 @Test
	 public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
		 Board board = new Board();
		 String result = board.paint(5, 4);
		 final String line = System.lineSeparator();
		 String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
		 assertThat(result, is(expected));
	 }
 }