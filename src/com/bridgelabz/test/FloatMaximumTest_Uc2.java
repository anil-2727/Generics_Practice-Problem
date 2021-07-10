package com.bridgelabz.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.program.FloatMaximum;

import junit.framework.Assert;

public class FloatMaximumTest {
	FloatMaximum floatmaximum  = new FloatMaximum();

	@Test
	public void givenFloatFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
		Float result = floatmaximum .getMax(27.2f, 22.2f, 02.7f);
		Assert.assertEquals(27.2f, result);
	}

	@Test
	public void givenFloatSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
		Float result = floatmaximum .getMax(22.2f, 27.2f, 02.7f);
		Assert.assertEquals(27.2f, result);
	}

	@Test
	public void givenFloatThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
		Float result = floatmaximum .getMax(02.7f, 22.2f, 27.2f);
		Assert.assertEquals(27.2f, result);
	}
}
