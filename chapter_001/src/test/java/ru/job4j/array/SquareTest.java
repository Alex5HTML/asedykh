package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
	@Test
	public void whenThen() {
		int[] testArray = {0, 1, 4, 9};
		Square square = new Square();
		int[] result = square.calculate(4);
		assertThat(result, is(testArray));
	}
}