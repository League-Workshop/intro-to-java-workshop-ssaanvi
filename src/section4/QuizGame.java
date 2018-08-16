package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score
		int score=0;
		
		// 2.  Ask the user a question 
		String question= JOptionPane.showInputDialog("A Farmer had 17 sheep, all but 9 died. How many live sheep are left?");
		
		// 3.  Use an if statement to check if their answer is correct
		if (question.equals("9")) {
			speak("Correct!");
			score++;
		}
		// 4.  if the user's answer is correct
		
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below.
		String question2= JOptionPane.showInputDialog("Some months have 30 days, some months have 31 days. How many months have 28 days?");
		if (question2.equals("All of them")) {
			speak("Correct!");
			score++;}
		else { speak("Incorrect");}
		
		
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
		
	}

	
		// TODO Auto-generated method stub
		static void speak(String words) {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

