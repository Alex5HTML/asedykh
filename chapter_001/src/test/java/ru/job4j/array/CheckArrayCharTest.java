package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckArrayCharTest {
	@Test
	public void whenLookForHellInWordHelloThanFind() {
		CheckArrayChar check = new CheckArrayChar();
		boolean result = check.contains("Hello", "Hell");
		assertThat(result, is(true));
	}
	
	@Test
	public void whenLookForDenceInWordDancingThanNotFind() {
		CheckArrayChar check = new CheckArrayChar();
		boolean result = check.contains("Dancing", "Dence");
		assertThat(result, is(false));
	}
	
}