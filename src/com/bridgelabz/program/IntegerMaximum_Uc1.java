package com.bridgelabz.program;

public class IntegerMaximum {

	public static void main(String[] args) {
		IntegerMaximum integerIntegerMaximum = new IntegerMaximum();
		Integer firstValue = 50;
		Integer secondValue = 40;
		Integer thirdValue = 30;
		int result = integerIntegerMaximum.getMax(firstValue, secondValue, thirdValue);
		System.out.println(result);

	}

	public Integer getMax(Integer firstValue, Integer secondValue, Integer thirdValue) {
		Integer max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;

		return max;
	}
}
