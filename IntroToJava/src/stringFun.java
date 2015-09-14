import javax.swing.JOptionPane;

public class stringFun
{

	public static void main(String[] args)
	{
		new stringFun();

	}

	stringFun()

	{
		String name = JOptionPane.showInputDialog("What word do you want to Analyze?");
		for (int i = name.length() - 1; i >= 0; i--)
		{
			System.out.print(name.charAt(i));
		}
	}
}
