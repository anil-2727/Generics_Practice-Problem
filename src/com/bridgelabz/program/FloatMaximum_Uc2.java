package com.bridgelabz.program;

public class FloatMaximum {

	public static void main(String[] args) {
		FloatMaximum floatMaximum = new FloatMaximum();
		Float firstValue = 27.2f;
		Float secondValue = 22.2f;
		Float thirdValue = 02.7f;

		System.out.println(floatMaximum.getMax(firstValue, secondValue, thirdValue));

	}

	public Float getMax(Float firstValue, Float secondValue, Float thirdValue) {
		Float max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;

		return max;
	}
}
