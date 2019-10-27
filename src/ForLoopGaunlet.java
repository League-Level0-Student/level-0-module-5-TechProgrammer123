
public class ForLoopGaunlet {
public static void main(String[] args) {
	System.out.println("step1");
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	
	}
	System.out.println("step2");
	for (int i = 100; i >= 0; i--) {
		System.out.println(i);
	}

	System.out.println("step3");
	for (int i = 2; i < 102; i++) {
		if (i%2==0) {
			System.out.println(i+" is even");
		}
	}
		System.out.println("step4");
	for (int i = 0; i < 100; i++) {
		if (i%2==1) {
			System.out.println(i+" is odd");
		
	}
	}
}
}
