package ru.job4j.array;

public class ArrayChar {
	private char[] data;
	
	public ArrayChar(String line) {
		this.data = line.toCharArray();
	}
	/**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
	public boolean startWith(String prefix) {
		boolean result = true;
		char[] value = prefix.toCharArray();
		if (value[0] != this.data[0] || value[1] != this.data[1]) {
			result = false;
		}
		return result;
	} 
}