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
	
	void incEx1 () {
		System.out.println("Incrementing Example:");
		for (int j=0; j<10; j++) { // j++ is the same as j = j + 1
			System.out.println(j);
		}
		
		System.out.println("Decrementing Example:");
		for (int j=9; j>=0; j--) { // j-- is the same as j = j - 1
			System.out.println(j);
		}
	}
	
	void incEx2 (int j) {
		System.out.println("Inside incEx2 method j = " + j);
		
		
	}
}
