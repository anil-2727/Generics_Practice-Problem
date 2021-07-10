package com.bridgelabz.program;

public class Refactor2<E extends Comparable<E>> {

	public static void main(String[] args) {
		Refactor2 maximum = new Refactor2();

		System.out.println(maximum.getMax(50, 40, 30));
		System.out.println(maximum.getMax(27.2f, 22.2f, 02.7f));
		System.out.println(maximum.getMax("Apple", "Banana", "Peach"));

	}

	public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue) {
		E max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;
		return max;
	}

}