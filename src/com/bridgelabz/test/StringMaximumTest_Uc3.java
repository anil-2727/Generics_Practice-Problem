package com.bridgelabz.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.program.StringMaximum;

public class StringMaximumTest {
	StringMaximum stringMaximum = new StringMaximum();

	@Test
	public void givenStringFirstGreater_WhenLargest_ShouldReturnTrue() {
		String result = stringMaximum.getMax("Peach", "Apple", "Banana");
		assertEquals("Peach", result);
	}

	@Test
	public void givenStringSecondGreater_WhenLargest_ShouldReturnTrue() {
		String result = stringMaximum.getMax("Apple", "Peach", "Banana");
		assertEquals("Peach", result);
	}

	@Test
	public void givenStringThirdGreater_WhenLargest_ShouldReturnTrue() {
		String result = stringMaximum.getMax("Apple", "Banana", "Peach");
		assertEquals("Peach", result);
	}

}
