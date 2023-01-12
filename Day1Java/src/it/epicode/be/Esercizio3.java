package it.epicode.be;

import java.util.Scanner;

public class Esercizio3 {
	
	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		
		System.out.println("type your name");
		String n = i.nextLine();
		
		System.out.println("type your surname");
		String s = i.nextLine();

		System.out.println("type your hobby");
		String h = i.nextLine();
		
		System.out.println( "Hi, I am " + n + " " + s + ", and I love " + h + "." );
		i.close();
		
		System.out.println( "Hi, I love " + h + " and my name is " + n + " " + s + ".");
		i.close();
	}
}
