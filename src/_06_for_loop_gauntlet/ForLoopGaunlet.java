package _06_for_loop_gauntlet;

public class ForLoopGaunlet {
public static void main(String[] args) {
	
	System.out.println("Step 1");
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	System.out.println("Step 2");
	for (int i = 100; i > -1; i--) {
		System.out.println(i);
	}
	System.out.println("Step 3");
	for (int i = 0; i < 101; i++) {
		if (i%2 == 0) {
			System.out.println(i);
		}
	}
		System.out.println("Step 4");
		for (int i = 0; i < 101; i++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
		} 
		System.out.println("Step 5");
			for (int i = 0; i < 501; i++) {
				if (i%2 == 0) {
					System.out.println(i+" is even");
				}
				else {
					System.out.println(i+" is odd");
				}
			}
			System.out.println("Step 6");
			for (int i = 0; i < 778; i++) {
				if (i%7 == 0) {
					System.out.println(i);
				}
			}
			for (int i = 2007; i < 2020; i++) {
				System.out.println("In "+i+" I was "+(i-2007)+" years old");
			}
		
	
}
}
