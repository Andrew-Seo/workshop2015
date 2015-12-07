import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level_1_Exam implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton butt1;
	JButton butt2;
	JButton butt3;
	JButton butt4;
	Color Yellow;
	Color Green;
	Color Red;
	Color Blue;

	public static void main(String[] args)
	{
		Level_1_Exam j = new Level_1_Exam();
	}

	void speak(String words)
	{
		try
		{
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	Level_1_Exam()
	{
		frame = new JFrame("Color Teacher");
		frame.setVisible(true);

		panel = new JPanel();
		frame.add(panel);

		butt1 = new JButton();
		panel.add(butt1);
		butt1.setBackground(Color.YELLOW);
		butt1.setOpaque(true);

		butt2 = new JButton();
		panel.add(butt2);
		butt2.setBackground(Color.RED);
		butt2.setOpaque(true);

		butt3 = new JButton();
		panel.add(butt3);
		butt3.setBackground(Color.BLUE);
		butt3.setOpaque(true);

		butt4 = new JButton();
		panel.add(butt4);
		butt4.setBackground(Color.GREEN);
		butt4.setOpaque(true);

		butt1.addActionListener(this);
		butt2.addActionListener(this);
		butt3.addActionListener(this);
		butt4.addActionListener(this);

		frame.setSize(500, 500);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if (e.getSource() == butt1)
		{
			speak("Yellow");
		}
		if (e.getSource() == butt2)
		{
			speak("Red");
		}
		if (e.getSource() == butt3)
		{
			speak("Blue");
		}
		if (e.getSource() == butt4)
		{
			speak("Green");
		}

	}
}
