             package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		
		speak( "spell supercalafragalisticsexpialadocis.");
		

		// 2. Catch the user's answer in a String
		String reply= JOptionPane.showInputDialog("Insert your answer below.");

		// 3. If the user spelled the word correctly, speak "correct"
		if (reply.equals("yes")) {
			speak("Correct!");
		}
	

		// 4. Otherwise say "wrong"
		else {
			speak("Incorrect!");
		}

		// 5. repeat the process for other words
		speak( "spell lalalalaladededededeland.");
		String reply2= JOptionPane.showInputDialog("Insert your answer below.");
		if (reply.equals("yes")) {
			speak("Correct!");
		}
		else {
			speak("Incorrect!");
		}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


