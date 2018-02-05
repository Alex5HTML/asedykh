package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 *@author Alexandr Sedykh
 *@version $ld$
 *@since 05.02.18
 */

public class CalculateTest {
	/**
	*Test echo.
	*/ @Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Alexandr Sedykh";
		String expect = "Echo, echo, echo: Alexandr Sedykh";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}	
}	