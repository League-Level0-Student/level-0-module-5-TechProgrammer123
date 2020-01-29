package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
         //  skills.skill1();
          // skills.skill2();
          // skills.skill3();
           skills.skill4();
           skills.skill5();
}

//void skill1() {
 //Use pop-ups for the following.
 //Ask the user how many dimes they have
//String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
//int dimesl = Integer.parseInt(dimes);


 //Tell them how many cents they have (hint multiply by 10)
//JOptionPane.showMessageDialog(null, dimesl * 10 + " cents");



// Ask the user how tall they are (inches)
//String height1 = JOptionPane.showInputDialog("How tall are you in inches?");
//int height = Integer.parseInt(height1);


// If they are shorter than 36 inches, tell them to eat their Wheaties
//if (height <= 36) {
	//JOptionPane.showMessageDialog(null, "Eat your Wheaties");
//}
//else {
	//JOptionPane.showMessageDialog(null, "Whoa");
//}


//}

//void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
//for (int i = 1; i < 31; i+=3) {
	
		//System.out.println(i);
	
//}






//}

//void skill3() { // Get a random number that is less than 20 and print it to the console 

	//int r = 0; 
	//Random random = new Random(); 
	//r = random.nextInt(20);
//System.out.println(r);
// Get another random number that is less than 10 and print it to the console 
	//int ra = 0; 
	//Random randoma = new Random(); 
	//ra = random.nextInt(11);
	//System.out.println(ra);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
//JOptionPane.showMessageDialog(null, "Here is the answer, "+ (r-ra));


//}

void skill4() { // In a pop-up, ask the user for the city they live in 
//String ifcitygoodyes = JOptionPane.showInputDialog("What city do you live in?");


// If they answered "San Diego", tell them they live in America's Finest City 
//if (ifcitygoodyes == "San Diego") {
	//JOptionPane.showMessageDialog(null, "You live in America's Finest City");
//}


// Otherwise, tell them to move to San Diego 
//else {
	//JOptionPane.showMessageDialog(null, "You live in North America's, South America's, Europe's, Asia's, Africa's, Austrailia's, Antarica's worst city");
//}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String cars = JOptionPane.showInputDialog("How many cars do you have?");
 int cars2 = Integer.parseInt(cars);

// If there is 1 car, use a pop-up to display the make/model of the car 
if (cars2 == 1) {
	JOptionPane.showInputDialog("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO\r\n" + 
			"O                                                     O                                  OOOOOOOOOO\r\n" + 
			"O                                                     O                                               OOOOOOOOOOO\r\n" + 
			"O                                                     O                                                                         OOOOO\r\n" + 
			"O                                                     O                                                                          OOOOOO \r\n" + 
			"O                                                     O                                                                          OOOOOOO\r\n" + 
			"O                                                     O                                                                                  OOOO\r\n" + 
			"O                                                     O                               Tesla                                                 OO\r\n" + 
			"O                                                     O                                                                                      OOO\r\n" + 
			"O                                                     O                                                                                    OOO\r\n" + 
			"O                                                     O                                                                                      OO\r\n" + 
			"O                                                     O                                                                                     OO\r\n" + 
			"O                                                     O                                                                                   OO\r\n" + 
			"O                                                     O                                                                           OOOO\r\n" + 
			"O                                                     O                                                                   OOOOO\r\n" + 
			"OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO\r\n" + 
			"                  OOOO                                                      OOOO\r\n" + 
			"              OO        OO                                               OO      OO\r\n" + 
			"               O            O                                                 O         O\r\n" + 
			"                 OO    OO                                                   OO  OO\r\n" + 
			"                      OO                                                            OO\r\n" + 
			"");
}


// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
if (cars2 >  1) {
	JOptionPane.showInputDialog("How many wheels the car jave between them");
}


}

void skill5() { // In a pop-up, ask the user for the name of their school 
String School = JOptionPane.showInputDialog("What is the name of your school?");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, School+" is a fantastic school");


}
}
