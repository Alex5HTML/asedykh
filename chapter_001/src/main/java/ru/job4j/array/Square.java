package ru.job4j.array;

public class Square {
	public int[] calculate(int bound) {
		int[] result = new int[bound];
		for (int index = 0; index != result.length; index++) {
			result[index] = index * index;
		}
		return result;
	}
}