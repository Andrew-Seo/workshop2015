package Level_2;

import java.awt.Graphics;
import java.awt.Rectangle;
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
		ball = new Ball(975, 750, 20, 20);
		blocks = new Blocks(925, 450, 125, 50);

	}

	public void paint(Graphics g)
	{
		for (int i = 0; i < Blocks.Blockamount - 1; i++)
		{
			g.fillRect(Blocks.Blox[i].x, Blocks.Blox[i].y, Blocks.Blox[i].width, Blocks.Blox[i].height);

		}
		pinger.paint(g);
		// blocks.paint(g);
		ball.paint(g);
	}

	private void checkcollisionbox()
	{
		Rectangle r1 = pinger.getCollisionBox();
		Rectangle r2 = ball.getCollisionBox();
		if (r1.intersects(r2))
		{
			ball.changeDirection();
		}
		// System.out.println(r2.getWidth());
		// System.out.println(r1.getWidth());
		// System.out.println(r2.getHeight());
		// System.out.println(r1.getHeight());
		for (int i = 0; i < Blocks.Blockamount - 1; i++)
		{
			if (r2.intersects(Blocks.Blox[i].x, Blocks.Blox[i].y, Blocks.Blox[i].width, Blocks.Blox[i].height))
			{
				ball.changeDirection();
			}
		}

	}

	public void update()
	{
		ball.update();
		pinger.update();
		checkcollisionbox();
	}

	public void movePinger(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			if (pinger.x > 100)
			{
				pinger.moveLeft();
			}
		}

		else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			if (pinger.x < 1400)
				pinger.moveRight();
		}
	}

}
