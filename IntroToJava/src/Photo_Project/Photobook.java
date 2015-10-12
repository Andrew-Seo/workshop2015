package Photo_Project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Photobook
{
	JFrame spen;
	Image_Panel impan;
	int w = 50;
	int h = 50;
	JFrame Window;
	JPanel Panel;
	JButton Next;
	JButton Previous;
	JButton Random;

	public Photobook()
	{
		spen = new JFrame();
		impan = new Image_Panel("Chinese.jpg", w, h);
		spen.setDefaultCloseOperation(spen.EXIT_ON_CLOSE);
		spen.add(impan);
		spen.setVisible(true);
		JPanel Panel = new JPanel();
		spen.add(Panel);
		JButton Next = new JButton("Next");
		Panel.add(Next);
		JButton Previous = new JButton("Previous");
		Panel.add(Previous);
		JButton Random = new JButton("Random");
		Panel.add(Random);
		spen.setSize(700, 700);

	}

	public static void main(String[] args)
	{
		Photobook j = new Photobook();
	}
}
