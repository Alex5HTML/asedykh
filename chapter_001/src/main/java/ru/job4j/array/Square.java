package ru.job4j.array;

public class Square {
	public int[] calculate(int bound) {
		int[] result = new int[bound];
		for (int x = 0; x != result.length; x++) {
			result[x] = x * x;
		}
		return result;
	}
}