package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
	@Test
	public void whenMultipleTableWithThreeThenMultipleTable() {
		Matrix matrix = new Matrix();
		int[][] resultArray = matrix.multiple(3);
		int[][] expectArray = {
							   {0, 1, 2, 3},
							   {1, 1, 2, 3},
							   {2, 2, 4, 6},
							   {3, 3, 6, 9}
							   };
		assertThat(resultArray, is(expectArray));
	}
	@Test
	public void whenMultipleTableWithFiveThenMultipleTable() {
		Matrix matrix = new Matrix();
		int[][] resultArray = matrix.multiple(5);
		int[][] expectArray = {
							  {0, 1, 2, 3, 4, 5},
							  {1, 1, 2, 3, 4, 5},
							  {2, 2, 4, 6, 8, 10},
						      {3, 3, 6, 9, 12, 15},
							  {4, 4, 8, 12, 16, 20},
							  {5, 5, 10, 15, 20, 25}
						      };
	}
}