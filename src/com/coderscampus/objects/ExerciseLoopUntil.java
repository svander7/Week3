package com.coderscampus.objects;

import java.util.Scanner;

public class ExerciseLoopUntil {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String userInput = scanner.nextLine();
		Integer conInput = Integer.parseInt(userInput);
		YourNumLoop num = new YourNumLoop();
		num.conInput = userInput;
		
		while (conInput < 50 || conInput > 300) {
			System.out.println(num.wrong());
			userInput = scanner.nextLine();
			conInput = Integer.parseInt(userInput);
			num.conInput = userInput;
		}
			
		System.out.println(num.right());
		
		scanner.close();
}

	}
