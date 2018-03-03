package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		String[] testArray = {"Привет", "Мир", "Привет", "Супер", "Мир"};
		ArrayDuplicate duplicate = new ArrayDuplicate();
		String[] resultArray = duplicate.remove(testArray);
		String[] expectArray = {"Привет", "Мир", "Супер"};
		assertThat(resultArray, is(expectArray));
	}
}