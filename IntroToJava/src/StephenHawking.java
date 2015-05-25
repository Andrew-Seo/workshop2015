import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

    // 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args)
	{
		// 2. ask the user for a sentence
		String words = JOptionPane.showInputDialog("Give Me A Sentence.");
		// 3. repeat the sentence using the speak method below
		while(true)
		{
		speak(words);
		}
		// 4. make this repeat a lot of times
		
	}

	
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}