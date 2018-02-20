package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexandr Sedykh
 * @version $Id$
 * @since 0.1
 */
 public class MaxTest {
	 @Test
	 public void whenFirstLessSecond() {
		 Max maximum = new Max();
		 int result = maximum.max(1, 2, 4);
		 assertThat(result, is(4));
	 }
 }