package com.Line.comparision;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public abstract class LineComparisionMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to line comparison computation program");
		double length[] = findLength();
		System.out.println("Length of line 1 is " + length[0]);
		System.out.println("Length of line 2 is " + length[1]);
		Double dLen1 = new Double(length[0]);
		Double dLen2 = new Double(length[1]);
		checkEqualityOfTwoLines(dLen1, dLen2);
	}

	public static void checkEqualityOfTwoLines(Double dLen1, Double dLen2) {

		if (dLen1.equals(dLen2)) {
			System.out.println("Two lines are equal ");
		} else if (dLen1.compareTo(dLen2) > 0) {
			System.out.println("line 1 is greater than line 2");
		} else {
			System.out.println("line 2 is greater than line 1");
		}
	}

	public static double[] findLength() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter values for line 2 ");
		double length2 = sqrt(Math.pow((sc.nextInt() - sc.nextInt()), 2) + Math.pow((sc.nextInt() - sc.nextInt()), 2));
		System.out.println("Enter values for line 1 ");
		double length1 = sqrt(Math.pow((sc.nextInt() - sc.nextInt()), 2) + Math.pow((sc.nextInt() - sc.nextInt()), 2));

		double arr[] = { length1, length2 };

		return arr;

	}

}
