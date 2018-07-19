package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String question=JOptionPane.showInputDialog("How many states have only four letter?");
		// 3.  Use an if statement to check if their answer is correct
		if (question.equals("3")) {
			score +=1;
		}
		question=JOptionPane.showInputDialog("How many teeth do elephants have?");
		if (question.equals("26")) {
			score+=1;
		}
		question=JOptionPane.showInputDialog("How many feet are in a football field?");
		if (question.equals("300")) {
			score+=1;
		}
		question=JOptionPane.showInputDialog("How many named oceans are there?");
				if (question.equals("4")) {
					score+=1;
				}
				JOptionPane.showMessageDialog(null, "Your score is " + score + ", Congratulations! You are the...");
				
	if (score==4) {
		JOptionPane.showMessageDialog(null, "WINNER!!!!!!");
	}
	}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
	
		
}

