package com.bridgelabz.program;

public class Refactor1 {

	public static void main(String[] args) {
		IntegerMaximum integermaximum = new IntegerMaximum();
		FloatMaximum floatmaximum = new FloatMaximum();
		StringMaximum stringMaximum = new StringMaximum();
		
		Integer firstIntgerValue = 50, secondIntegerValue = 40, thirdIntegerValue = 30;
		Float firstFloatValue = 27.2f, secondFloatValue = 22.2f, thirdFloatValue = 02.7f;
		String firstStringValue = "Apple", secondStringValue = "Peach", thirdStringValue = "Banana";
		
		System.out.println(integermaximum.getMax(firstIntgerValue, secondIntegerValue, thirdIntegerValue));
		System.out.println(floatmaximum.getMax(firstFloatValue, secondFloatValue, thirdFloatValue));
		System.out.println(stringMaximum.getMax(firstStringValue, secondStringValue, thirdStringValue));

	}

	public <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue) {
		E max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;

		return max;
	}
}
