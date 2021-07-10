package com.bridgelabz.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.program.Maximum;

import junit.framework.Assert;


	public class MaximumTest {
		@Test
		public void givenIntegerFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
			assertEquals(50, new Maximum(50, 40, 30).getMax());
		}

		@Test
		public void givenIntegerSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
			assertEquals(50, new Maximum(40, 50, 30).getMax());
		}

		@Test
		public void givenIntegerThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
			assertEquals(50, new Maximum(30, 40, 50).getMax());
		}

		@Test
		public void givenFloatFirstNumberGreater_WhenLargest_ShouldReturnTrue() {
			assertEquals(27.2f, new Maximum(27.2f, 22.2f, 02.7f).getMax());
		}

		@Test
		public void givenFloatSecondNumberGreater_WhenLargest_ShouldReturnTrue() {
		assertEquals(27.2f, new Maximum(22.7f, 27.2f, 02.7f).getMax());
		}

		@Test
		public void givenFloatThirdNumberGreater_WhenLargest_ShouldReturnTrue() {
			assertEquals(27.2f, new Maximum(22.2f, 02.7f, 27.2f).getMax());
		}

		@Test
		public void givenStringFirstGreater_WhenLargest_ShouldReturnTrue() {
			assertEquals("Peach", new Maximum("Peach", "Banana", "Apple").getMax());
		}

		@Test
		public void givenStringSecondGreater_WhenLargest_ShouldReturnTrue() {
			assertEquals("Peach", new Maximum("Apple","Peach", "Banana").getMax());
		}

		@Test
		public void givenStringThirdGreater_WhenLargest_ShouldReturnTrue() {
			assertEquals("Peach", new Maximum("Banana", "Apple", "Peach").getMax());
		}

		@Test
		public void givenValueGreaterThan3IntegerValue_WhenLargest_ShouldReturnTrue() {
			assertEquals(50, new Maximum(50, 40, 30, 20).getMax());
		}

		@Test
		public void givenValueGreaterThan3FloatValue_WhenLargest_ShouldReturnTrue() {
			assertEquals(27.2f, new Maximum(27.2f, 22.2f, 02.7f, 10.2f).getMax());
		}

		@Test
		public void givenValueGreaterThan3StringValue_WhenLargest_ShouldReturnTrue() {
	      assertEquals("Peach", new Maximum("Apple", "Banana", "Peach", "Mango", "Orange").getMax());

		}
	}

