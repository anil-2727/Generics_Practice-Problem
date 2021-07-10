package com.bridgelabz.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.program.IntegerMaximum;
import com.bridgelabz.program.Refactor2;

import junit.framework.Assert;

public class Refactor2Test {
	
	Refactor2 maximum = new Refactor2();
	@Test
	public void givenIntegerFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
		int result = maximum.getMax(50, 40, 30);
		assertEquals(50, result);
	}
	@Test
	public void givenIntegerSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
		int result = maximum.getMax(40, 50, 30);
		assertEquals(50, result);
	}

	@Test
	public void givenIntegerThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
		int result = maximum.getMax(40, 30, 50);
		assertEquals(50, result);
	}
	@Test
	public void givenFloatFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
		Float result = maximum .getMax(27.2f, 22.2f, 02.7f);
		Assert.assertEquals(27.2f, result);
	}

	@Test
	public void givenFloatSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
		Float result = maximum.getMax(22.2f, 27.2f, 02.7f);
		Assert.assertEquals(27.2f, result);
	}

	@Test
	public void givenFloatThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
		Float result = maximum.getMax(02.7f, 22.2f, 27.2f);
		Assert.assertEquals(27.2f, result);
	}
	@Test
	public void givenStringFirstGreater_WhenLargest_ShouldReturnTrue() {
		String result = maximum.getMax("Peach", "Apple", "Banana");
		assertEquals("Peach", result);
	}

	@Test
	public void givenStringSecondGreater_WhenLargest_ShouldReturnTrue() {
		String result = maximum.getMax("Apple", "Peach", "Banana");
		assertEquals("Peach", result);
	}

	@Test
	public void givenStringThirdGreater_WhenLargest_ShouldReturnTrue() {
		String result = maximum.getMax("Apple", "Banana", "Peach");
		assertEquals("Peach", result);
	}
}
