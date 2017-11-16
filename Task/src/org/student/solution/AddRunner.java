package org.student.solution;

public class AddRunner {

	public static void main(String[] args) {

		int a = 33770;

		long b = 4567890;

		double c = 5.55;

		double maxResult = getMaxResult(a, b, c);
		System.out.printf("Максимальное значение:%f", maxResult);

		// System.out.println("Максимальное значение:"+maxResult);

	}

	private static double getMaxResult(int a, long b, double c) {

		double result = 0;
		double A_B = (a * b);
		double B_C = (a * c);
		double A_C = (b * c);
		if (A_B > A_C && A_B > B_C) {
			result = A_B;
		}
		if (B_C > A_B && B_C > A_C) {
			result = B_C;
		}
		if (A_C > A_B && A_C > B_C) {
			result = A_C;
		}
		return result;
	}

}
