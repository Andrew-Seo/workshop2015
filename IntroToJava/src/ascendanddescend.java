import javax.swing.JOptionPane;


public class ascendanddescend
{
	public static void main(String[] args)
	{
String x = JOptionPane.showInputDialog("Narrator whispers: Tell me a number.");
String y = JOptionPane.showInputDialog("Narrator whispers: Tell me another number thats different from the previous number.");
String z = JOptionPane.showInputDialog("Narrator whispers: Tell me another number thats different from the previous and the previous previous number.");
int one = Integer.parseInt(x);
int two = Integer.parseInt(y);
int three = Integer.parseInt(z);
if (one>two && two > three){
	System.out.println("AscendingOrder"+one+">"+two+">"+three+"\n"+"DescendingOrder"+three+">"+two+">"+one);
}
if (one>three && three > two){
	System.out.println("AscendingOrder"+one+">"+three+">"+two);
}
if (two>one && one > three){
	System.out.println("AscendingOrder"+two+">"+one+">"+three);
}
if (two>three && three > one){
	System.out.println("AscendingOrder"+two+">"+three+">"+one);
}
if (three>one && one > two){
	System.out.println("AscendingOrder"+three+">"+one+">"+two);
}
if (three>two && two > one){
	System.out.println("AscendingOrder"+three+">"+two+">"+one);
}
	}

}
