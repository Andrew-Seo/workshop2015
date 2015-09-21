import java.io.FileReader;

public class VirtualMessage
{

	public static void main(String[] args)
	{

		try
		{
			FileReader fr = new FileReader("jjjh.txt");
			int z = 0;
			while (z != -1)
			{
				z = fr.read();
				System.out.print((char) (z));

			}

		} catch (Exception Anderz)
		{
			// TODO Auto-generated catch block
			Anderz.printStackTrace();
		}

	}
}
