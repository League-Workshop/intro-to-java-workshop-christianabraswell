package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		spell("mandlebrot");
		spell("handkerchief");
		spell("indict");
		spell("conscience");
		spell("cemetery");
		spell("rhythm");
	}
	// 4. Otherwise say "wrong"

	private static void spell(String w) {
		speak("spell " + w);
		for (int i = 0; i < 3; i++) {
			// 2. Catch the user's answer in a String
			String answer = JOptionPane.showInputDialog("Type what you hear.");
			// 3. If the user spelled the word correctly, speak "correct"
			if (answer.equals(w)) {
				speak("correct");
				break;
			} else
				speak("try again");
		}
	}

	// 5. repeat the process for other words

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
