import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;

public class robotWindow
{
	JFrame Window;
	JPanel Drawer;
	Font timesnewroman;
	Font comicsans;
	JButton ComicSans;
	Font TimesNewRoman;
	JButton Generate;
	JLabel Sides;
	JLabel SideLength;
	JLabel PenSize;
	JLabel PenColor;
	JLabel Speed;
	int start = 0;
	int fontstart = 200;
	Random rand;

	public static void main(String[] args)
	{
		robotWindow Andrew = new robotWindow();
		new robotWindow();

	}

	robotWindow()
	{
		Window = new JFrame();
		Window.setVisible(true);
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Drawer = new JPanel();
		timesnewroman = new Font("Times New Roman", Font.BOLD, fontstart);
		PenSize.setFont(TimesNewRoman);
		PenColor.setForeground(Color.GREEN);
		Drawer.add(PenSize);
		Drawer.add(PenColor);

		Robot Anderz = new Robot();
		Robot Wonny = new Robot(500, 500);
		drawSquare(Anderz);
		drawTriangle(Wonny);
		// |= length of line
		drawPolygon(Anderz, 200, 1);
		// |=# of sides

	}

	void drawSquare(Robot At)
	{

		At.penDown();
		At.setSpeed(10);
		for (int i = 0; i < 4; i++)
		{
			At.move(500);
			At.turn(90);
		}
	}

	void drawTriangle(Robot At)
	{

		At.penDown();
		At.setSpeed(10);
		for (int i = 0; i < 3; i++)
		{
			At.turn(120);
			At.move(500);
		}
	}

	void drawPolygon(Robot At, int sides, int length)
	{

		At.penDown();
		At.setSpeed(10);
		for (int i = 0; i < sides; i++)
		{
			At.turn(360 / sides);
			At.move(length);
		}
	}

}
