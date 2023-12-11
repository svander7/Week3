package com.coderscampus.objects;

import java.util.Scanner;

public class Week3Exercise {
		
	public static void main(String[] args)  {
		
		// This is just for teaching purposes /////////
		// With respect to imports / packages   ///////
		// java.lang is by default imported for us ////
		//java.lang.String aString = "Hello World!"; //
		//String anotherString = "Another String";   //
		///////////////////////////////////////////////
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Type in Your Name:");
		//String name = scanner.nextLine();
		//System.out.println("Type in Your Age:");
		//String age = scanner.nextLine();
		
		//if (name.equals("Trevor") 
		//		&& age.equals("36")
		//		|| name.equals("TJ")) {
		//	System.out.println("Holy cow it's me!");
		//} else {
		//	System.out.println("Hello: " + name);
		//}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String userInput = scanner.nextLine();
		Integer conInput = Integer.parseInt(userInput);
		YourNumber num = new YourNumber ();
		num.conInput = userInput;
				
			if (conInput >= 50 && conInput <= 300)	{
				System.out.println(num.right());
			} else if (conInput < 50) {
				System.out.println(num.wrong());
			} else if (conInput > 300) { 
				System.out.println(num.wrong());
			} 
			
		scanner.close();
	}
}
