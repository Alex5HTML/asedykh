package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(2, 2);
		double result = calc.getResult();
		double expected = 4;
		assertThat(result, is(expected));
	}
	@Test
	public void whenSubtractOneFromFourThenThree() {
		Calculator calc1 = new Calculator();
		calc1.subtract(4, 1);
		double result = calc1.getResult();
		double expected = 3;
		assertThat(result, is(expected));
	}
	@Test
	public void whenDivFourToTwoThenTwo() {
		Calculator calc2 = new Calculator();
		calc2.div(4, 2);
		double result = calc2.getResult();
		double expected = 2;
		assertThat(result, is(expected));
	}
	@Test
	public void whenMultipleThreeToThreeThenNine() {
		Calculator calc3 = new Calculator();
		calc3.multiple(3, 3);
		double result = calc3.getResult();
		double expected = 9;
		assertThat(result, is(expected));
	}	
}	
	