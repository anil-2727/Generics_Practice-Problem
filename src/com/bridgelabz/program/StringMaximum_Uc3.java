package com.bridgelabz.program;

public class StringMaximum {

	public static void main(String[] args) {
		StringMaximum stringMaximum = new StringMaximum();
		String firstValue = "Apple";
		String secondValue = "Peach";
		String thirdValue = "Banana";

		System.out.println(stringMaximum.getMax(firstValue, secondValue, thirdValue));

	}

	public String getMax(String firstValue, String secondValue, String thirdValue) {
		String max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;

		return max;
	}
}
