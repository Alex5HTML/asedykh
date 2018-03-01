package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		int[] testArray = {1, 2, 3, 4};
		Turn turn = new Turn();
		int[] resultArray = turn.back(testArray);
		int[] expectArray = {4, 3, 2, 1};
		assertThat(resultArray, is(expectArray));
	}
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		int[] testArray = {1, 2, 3, 4, 5};
		Turn turn = new Turn();
		int[] resultArray = turn.back(testArray);
		int[] expectArray = {5, 4, 3, 2, 1};
		assertThat(resultArray, is(expectArray));
	}
}