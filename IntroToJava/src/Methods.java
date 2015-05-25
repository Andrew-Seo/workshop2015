import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class Methods
{

	public static void main(String[] args)
	{

		new Methods();

	}

	Methods()
	{
		
		for (int i = 0; i < 1000000; i++)
		{
			square(new Random().nextInt(1000));
			triangle(new Random().nextInt(1000));
			hexagon(new Random().nextInt(1000));
		}

	}

	void square(int side)
	{

		Tortoise.show();
		Tortoise.setPenWidth(10);
		Tortoise.setSpeed(10);
		for (int i = 0; i < 4; i++)
		{
			Tortoise.move(90);
			Tortoise.turn(90);
		}

	}
	void triangle(int side)
	{

		Tortoise.show();
		Tortoise.setPenWidth(10);
		Tortoise.setSpeed(10);
		for (int i = 0; i < 3; i++)
		{
			Tortoise.move(90);
			Tortoise.turn(120);
		}

	}
	
	void hexagon(int side)
	{

		Tortoise.show();
		Tortoise.setPenWidth(10);
		Tortoise.setSpeed(10);
		for (int i = 0; i < 4; i++)
		{
			Tortoise.move(90);
			Tortoise.turn(60);
		}

	}

}