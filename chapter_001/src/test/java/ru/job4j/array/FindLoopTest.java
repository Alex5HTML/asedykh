package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
	@Test
	public void whenArrayFindsItem() {
		int[] testArray = {0, 1, 2, 3, 4, 5, 6, 7};
		FindLoop loop = new FindLoop();
		int result = loop.indexOf(testArray, 5);
		assertThat(result, is(5));
	}
	
	@Test
	public void whenArrayCantFindItem() {
		int[] testArray = {0, 1, 2, 3, 3, 4, 4, 7};
		FindLoop loop = new FindLoop();
		int result = loop.indexOf(testArray, 4);
		assertThat(result, is(-1));
	}
}