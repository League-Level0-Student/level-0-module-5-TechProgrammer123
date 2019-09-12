package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {

	String primeornot = JOptionPane.showInputDialog("What prime number you want to check");
	int primeOrNot = Integer.parseInt(primeornot);
	int counter = 0;
	for (int i = 2; i < primeOrNot; i++) {
		
		if (primeOrNot%i == 0) {
		counter++;	
		}
		
	}
	if (counter == 0) {
		JOptionPane.showMessageDialog(null, "Prime");
	}
	if(counter >=2) {
		JOptionPane.showMessageDialog(null, "Not Prime");
		
	}
	
	
	
}}

