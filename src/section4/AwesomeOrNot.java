package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	
int rand= new Random().nextInt(4);
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable
System.out.println(rand);
	// 4. Get the user to enter something that they think is awesome
String answer= JOptionPane.showInputDialog("Enter something below that you think is awesome.");
	// 5. If the random number is 0
if (rand==0) {
	JOptionPane.showMessageDialog(null, "You are awesome!");
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if (rand==1) {
	JOptionPane.showMessageDialog(null, "Eh, that's okay, I guess.");
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if (rand==2) {
	JOptionPane.showMessageDialog(null, "That is boring!");
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if (rand==3) {
	JOptionPane.showMessageDialog(null, "Based off of that answer, you will rule the world!");
}
	// -- write your own answer

}
}

