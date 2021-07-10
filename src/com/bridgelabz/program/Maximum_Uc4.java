package com.bridgelabz.program;

public class Maximum<E extends Comparable<E>> {
	E firstValue;
	E secondValue;
	E thirdValue;
	E[] extraParamaters;

	public Maximum(E firstValue, E secondValue, E thirdValue, E... extraParamaters) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
		this.extraParamaters = extraParamaters;
	}

	public static void main(String[] args) {
		new Maximum(50, 40, 30, 20).getMax();
		new Maximum(27.2f, 22.2f, 02.7f, 10.2f).getMax();
		new Maximum("Apple", "Banana", "Peach", "Mango", "Orange").getMax();
	}

	public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue, E... extraParamaters) {
		E max = firstValue;
		if (secondValue.compareTo(max) > 0)
			max = secondValue;
		if (thirdValue.compareTo(max) > 0)
			max = thirdValue;
		if (extraParamaters.length != 0) {
			for (E extraParamater : extraParamaters) {
				if (extraParamater.compareTo(max) > 0) {
					max = extraParamater;
				}
			}
		}
		return max;
	}

	public <E extends Comparable<E>> E getMax() {
		E max = (E) getMax(firstValue, secondValue, thirdValue, extraParamaters);
		return max;
	}
}