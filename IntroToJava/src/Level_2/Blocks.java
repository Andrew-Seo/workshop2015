package Level_2;

import java.awt.Color;
import java.awt.Graphics;

public class Blocks
{
	public int x;
	public int y;
	public int height;
	public int width;
	static Blocks[] Blox = new Blocks[86];
	public static int Blockamount;

	public Blocks(int a, int b, int c, int d)
	{
		x = a;
		y = b;
		width = c;
		height = d;
		Blockamount++;
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(925, 450, 125, 50);

	}
}
