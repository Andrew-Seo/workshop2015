import javax.swing.JOptionPane;


public class GuessTheAnimal
{
public static void main(String[] args)
{
	// 1. ask user if it has 4 legs. if yes, it’s a pig if no, it’s a monkey 
	
	// 2. add zebra, pig, monkey, bird,
	
	// 3. add fish and spider.
	
	
	  
	  int result = JOptionPane.showConfirmDialog(null, "Does it have 4 legs?", "", JOptionPane.YES_NO_OPTION);
	  
	if (result == JOptionPane.NO_OPTION)
	{  
		 int result1 = JOptionPane.showConfirmDialog(null, "Does it have 2 legs?", "", JOptionPane.YES_NO_OPTION);
		  
			if (result1 == JOptionPane.NO_OPTION)
			{
				 int result2 = JOptionPane.showConfirmDialog(null, "Does it live in water?", "", JOptionPane.YES_NO_OPTION);
				  
					if (result2 == JOptionPane.NO_OPTION)
					{
						JOptionPane.showMessageDialog(null, "It might be a spider.");
					}
					else if (result2 == JOptionPane.YES_OPTION)
					{
						JOptionPane.showMessageDialog(null, "It might be a fish. ");
					}
			}
			else if (result == JOptionPane.YES_OPTION)
			{
				 int result3 = JOptionPane.showConfirmDialog(null, "Is it covered in fur?", "", JOptionPane.YES_NO_OPTION);
				  
					if (result3 == JOptionPane.NO_OPTION)
					{
						JOptionPane.showMessageDialog(null, "It might be a monkey.");
					}
					else if (result3 == JOptionPane.YES_OPTION)
					{
						JOptionPane.showMessageDialog(null, "It might be a yeti. ");
					}
			}
	}
	else if (result == JOptionPane.YES_OPTION)
	{
		 int result4 = JOptionPane.showConfirmDialog(null, "Does it have stripes?", "", JOptionPane.YES_NO_OPTION);
		  
			if (result4 == JOptionPane.NO_OPTION)
			{
				JOptionPane.showMessageDialog(null, "It might be a pig.");
			}
			else if (result4 == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null, "It might be a zebra.");
			}
	}
	 
	 
}


}

