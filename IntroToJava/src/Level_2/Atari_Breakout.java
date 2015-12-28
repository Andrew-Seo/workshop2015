package Level_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Atari_Breakout implements ActionListener, KeyListener
{
	JFrame frame;
	Animation_Panel panel;
	Timer timer;
	public final int panelWidth = 1900;
	public final int panelHeight = 1000;

	public static void main(String[] args)
	{
		Atari_Breakout Window = new Atari_Breakout();

	}

	Atari_Breakout()
	{

		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.addKeyListener(this);

		panel = new Animation_Panel();
		frame.add(panel);

		timer = new Timer(1000 / 60, this);
		timer.start();

		frame.setSize(panelWidth, panelHeight);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		panel.update();
		panel.repaint();
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		// TODO Auto-generated method stub
		panel.movePinger(e);
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}
}
