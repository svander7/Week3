package com.coderscampus.objects;

import java.util.Scanner;

public class ExerciseCreatingAMethod {
	
	public static void main(String[] args)  {
	
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
