import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton b;
	Date d;
	int roundsPlayed = 0;
	int roundsWon = 0;

	public static void main(String[] args)
	{
		Whackamole mole = new Whackamole();

	}

	Whackamole()
	{
		d = new Date(System.currentTimeMillis());
		drawButtons(24);
	}

	void drawButtons(int x)
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		panel = new JPanel();
		frame.add(panel);

		for (int i = 0; i < 29; i++)
		{
			JButton b = new JButton();
			b.addActionListener(this);
			if (i == x)
			{
				b.setText("mole");
			}
			panel.add(b);
			frame.setSize(900, 700);
		}

	}

	// If they click on a button other than “mole!”, use this speak() method to
	// call them a dork.
	void speak(String words)
	{
		try
		{
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	private void endGame(Date timeAtStart, int molesWhacked)
	{
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null,
				"Your whack rate is " + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	private void playSound(String fileName)
	{
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e)

	{
		// TODO Auto-generated method stub
		JButton j = (JButton) e.getSource();
		roundsPlayed++;
		if (j.getText().equals("mole"))
		{
			System.out.print("hi");
			frame.dispose();
			drawButtons(new Random().nextInt(24));
			roundsWon++;
		}
		if (roundsPlayed >= 10)
		{
			endGame(d, roundsWon);

		}

	}

}
