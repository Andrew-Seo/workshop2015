package Level_2;

import java.awt.Color;
import java.awt.Graphics;

public class Pinger
{
	private int x;
	private int y;
	private int height;
	private int width;

	public Pinger(int a, int b, int c, int d)
	{
		x = a;
		y = b;
		height = c;
		width = d;

	}

	public void update()
	{

	}

	public void moveLeft()
	{
		x = x - 50;
		if (x <= 0 + width)
		{
			x = 0 + width;
		}
		if (x >= 2000 - width)
		{
			x = 2000 - width;
		}
	}

	public void moveRight()
	{
		x = x + 50;
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.GRAY);
		g.fillRect(x, y, height, width);

	}
}
