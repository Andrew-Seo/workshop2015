package Level_2;

import java.awt.Color;
import java.awt.Graphics;

public class Ball
{

	private int x;
	private int y;
	private int height;
	private int width;

	public Ball(int a, int b, int c, int d)
	{
		x = a;
		y = b;
		height = c;
		width = d;
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.GRAY);
		g.fillOval(925, 750, 50, 50);

	}
}
