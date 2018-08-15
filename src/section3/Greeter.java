package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String Name=JOptionPane.showInputDialog("What's Ur Name?");
	System.out.println(Name);
	JOptionPane.showMessageDialog(null, "Hello "+ Name);
}
}
