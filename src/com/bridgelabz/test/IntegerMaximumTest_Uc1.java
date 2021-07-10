package com.bridgelabz.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.program.IntegerMaximum;

public class IntegerMaximumTest {
	IntegerMaximum integermaximum = new IntegerMaximum();

	@Test
	public void givenIntegerFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
		int result = integermaximum.getMax(50, 40, 30);
		assertEquals(50, result);
	}

	@Test
	public void givenIntegerSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
		int result = integermaximum.getMax(40, 50, 30);
		assertEquals(50, result);
	}

	@Test
	public void givenIntegerThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
		int result = integermaximum.getMax(40, 30, 50);
		assertEquals(50, result);
	}
}
