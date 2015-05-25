import java.util.Random;

import javax.swing.JOptionPane;

public class HiLowGame
{
	public static void main(String[] args)
	{

		String Question = JOptionPane.showInputDialog("Guess a number between negative 1 million and 1 million");
		int userInput = Integer.parseInt(Question);
		int computerInput = new Random().nextInt(1000000000);

		for (int i = 0; i < 100; i++)
		{

			if (computerInput == userInput)
			{
				JOptionPane.showMessageDialog (null,"Sat is correct");
				
			}
			if (computerInput < userInput)
			{
				String lower = JOptionPane.showInputDialog("lower");
				userInput = Integer.parseInt(lower);
			}
			if (computerInput > userInput)
			{
				String higher = JOptionPane.showInputDialog("higher");

				userInput = Integer.parseInt(higher);
			}

		}
	}
}
