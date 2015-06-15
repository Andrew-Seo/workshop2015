import javax.swing.JOptionPane;


public class HadtoStop
{
public static void main(String[] args)
{
	int max= Integer.parseInt(JOptionPane.showInputDialog(null, "Think of a maximum number on the top of your head."));
	int min= Integer.parseInt(JOptionPane.showInputDialog(null, "Think of a minimum number on the top of your head."));
	if (min>max)
	{
		JOptionPane.showMessageDialog(null, "ERROR!!!");
	}
	
	
	    JOptionPane.showMessageDialog(null, "I HEHT U!!!");
}
}
