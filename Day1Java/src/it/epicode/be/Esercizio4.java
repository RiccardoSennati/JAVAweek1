package it.epicode.be;

import java.util.Scanner;

public class Esercizio4 {
	
	public static void main(String[] args) {
	
	Scanner i = new Scanner(System.in);
	
	// Perimeter of Rectangle
	System.out.println("To calcolate the perimetr type the height of rectangle");
	double perA = i.nextDouble();
	
	System.out.println("Type the base");
	double perB = i.nextDouble();
	
	System.out.println("The perimeter of your rectangle is " + per(perA,perB));
	
	// EvenOdd
	System.out.println("Please type a number and if the result is 0 your number is even, if it's 1 your number is odd");
	int n = i.nextInt();
	System.out.println(eOdd(n));
	
	// Area of Triangle
	System.out.println("To calcolate the area of triangle type the side a");
	double sA = i.nextDouble();
	
	System.out.println("Type the side b");
	double sB = i.nextDouble();
	
	System.out.println("type the side c");
	double sC = i.nextDouble();
	
	System.out.println("the area of triangle is " + tArea(sA,sB,sC));
	
	i.close();
	}
	
	//Methods
	static double per(double a, double b) {
		return (a * 2) + (b * 2);
	}	
	
	static int eOdd(int n) {
		if (n % 2 == 0) {
			return 0;
		}
		return 1;
 	}
	
	static double tArea(double a, double b, double c) {
		return Math.sqrt((a + b +c) * (-a +b + c) * (a - b + c) * (a + b - c)) / 4;
	}
}

