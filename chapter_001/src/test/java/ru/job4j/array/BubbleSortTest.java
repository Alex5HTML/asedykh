package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		int[] testArray = {2, 4, 3, 1, 8, 9, 0, 5, 6, 7};
		BubbleSort bubble = new BubbleSort();
		int[] resultArray = bubble.sort(testArray);
		int[] expectArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertThat(resultArray, is(expectArray));
	}
}