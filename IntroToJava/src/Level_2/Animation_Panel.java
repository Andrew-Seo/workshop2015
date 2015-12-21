package Level_2;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class Animation_Panel extends JPanel
{
	Pinger pinger;
	Blocks blocks;
	Ball ball;

	Animation_Panel()
	{
		pinger = new Pinger(800, 900, 400, 15);
		blocks = new Blocks(925, 450, 125, 50);
		ball = new Ball(975, 750, 20, 20);

	}

	public void paint(Graphics g)
	{
		pinger.paint(g);
		blocks.paint(g);
		ball.paint(g);
	}

	public void update()
	{
		ball.update();
		pinger.update();
	}

	public void movePinger(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			System.out.println("hgjhgjhgjhg");
			pinger.moveLeft();
		}

		else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			pinger.moveRight();
		}
	}

}
