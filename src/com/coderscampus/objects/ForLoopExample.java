package com.coderscampus.objects;

public class ForLoopExample {

	void forLoopExample () {
	
		// Use "for" loop when you know the # of cycles required
			// initalization, Termination Condition; Increment (i = index)
			for (int i = 0; i <= 5; i = i + 1) {
				System.out.print(i + " - ");
				System.out.println(i*i);
			}
			
			System.out.println("Done!");
		}
}
