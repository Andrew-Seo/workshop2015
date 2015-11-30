import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestPreview implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;

	public static void main(String[] args)
	{
		TestPreview frame = new TestPreview();
	}

	TestPreview()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		panel = new JPanel();
		frame.add(panel);
		button1 = new JButton("Daily Message");
		panel.add(button1);
		button2 = new JButton("Random Number");
		panel.add(button2);
		button3 = new JButton("Exit");
		panel.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.setSize(900, 700);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if (e.getSource() == button1)
		{
			JOptionPane.showMessageDialog(null, "You look nice today");
		} else if (e.getSource() == button2)
		{
			int x = new Random().nextInt(100) + 1;
			JOptionPane.showMessageDialog(null, x);
		} else if (e.getSource() == button3)
		{
			System.exit(1);
		}

	}
}
