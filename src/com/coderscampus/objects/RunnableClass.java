package com.coderscampus.objects;

import java.util.Random;

public class RunnableClass {

	public static void main(String[] args) {
		// Class -> Blueprint for a Object
		// Object -> A Noun, it's an instantiation of a Class
		
		// Data type, variable name, assignment operation
		// int someNumber = 39;
		// Random random = new Random();
		
		// for (int i = 0; i < 20; i++) {
		// System.out.println("Your random number is " + random.nextInt(10));
		// }
		
		// Call the no arg constructor
		Human someOtherHuman = new Human();
		
		// Call the 4 arg constructor
		Human trevorPage = new Human("male", "5'10\"", "160", "brown");
		
		 System.out.println(trevorPage.getinfo());
		
		Human elonMusk = new Human("male", "6'1\"", "190", "blue");
		
		 System.out.println(elonMusk.getinfo());
		
		Human christinaPage = new Human ("female", "5'5\"", "130", "brown");
		
		 System.out.println(christinaPage.getinfo());
	}

}
