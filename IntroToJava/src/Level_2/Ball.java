package Level_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball
{

	private int x;
	private int y;
	private int height;
	private int width;
	private Rectangle collisionbox;

	public Ball(int a, int b, int c, int d)
	{
		x = a;
		y = b;
		width = c;
		height = d;
		collisionbox = new Rectangle(a, b, c, d);
	}

	public void update()
	{
		x = x + 1;
		y = y + 1;

		collisionbox.setBounds(x, y, width, height);
	}

	public Rectangle getCollisionBox()
	{
		return collisionbox;
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.GRAY);
		g.fillOval(x, y, height, width);

	}
}
