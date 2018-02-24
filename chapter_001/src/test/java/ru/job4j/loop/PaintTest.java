package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 *
 * @author Alexandr Sedykh
 * @version $Id$
 * @since 24.02.18
 */
 public class PaintTest {
	 @Test
	 public void whenPyramid4ThenPiramidBuild() {
		 Paint paint = new Paint();
		 String rst = paint.piramid(4);
		 System.out.println(rst);
		 assertThat(rst,
				 is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
							.add("   ^   ")
							.add("  ^^^  ")
							.add(" ^^^^^ ")
							.add("^^^^^^^")
							.toString()
				)
		);						
	 }
 }