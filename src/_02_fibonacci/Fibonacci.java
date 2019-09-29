package _02_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
int a =0;
int b =1;
int temp=0;
System.out.println(a);
System.out.println(b);
	for (int i = 0; i < 12; i++) {
		temp = a+b;
		a=b;
		b=temp;
		
	System.out.println(temp);
	}
	
}
}
