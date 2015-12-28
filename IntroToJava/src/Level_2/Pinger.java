package Level_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pinger
{
	private int x;
	private int y;
	private int height;
	private int width;
	private Rectangle collisionbox;

	public Pinger(int a, int b, int c, int d)
	{
		x = a;
		y = b;
		width = c;
		height = d;
		collisionbox = new Rectangle(a, b, c, d);
	}

	public void update()
	{
		collisionbox.setBounds(x, y, width, height);
	}

	public Rectangle getCollisionBox()
	{
		return collisionbox;
	}

	public void moveLeft()
	{
		x = x - 50;
		if (x <= 0 + width)
		{
			x = 0 + width;
		}
		if (x >= 1501 - width)
		{
			x = 1501 - width;
		}
	}

	public void moveRight()
	{
		x = x + 50;
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.GRAY);
		g.fillRect(x, y, width, height);

	}
}
