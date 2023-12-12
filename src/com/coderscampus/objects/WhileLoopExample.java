package com.coderscampus.objects;

import java.util.Date;

public class WhileLoopExample {
	
	void wLE1 () {
		// This is exactly how a FOR loop works
		// you don't actually ever need a FOR loop
		// as you can create one with a WHILE loop.
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i = i + 1;
		}
		
		System.out.println("Done!");
	}
	
	void wLE2 () {
		
		Date now = new Date();
		Date stopNow = new Date(123, 11, 12, 8, 25, 0);
				
		int i = 0;
		while (now.before(stopNow)) {
			i = i + 1;
			System.out.println(i + " - " + now);
			now = new Date();
		}
		
		System.out.println("Done!");
	}
}