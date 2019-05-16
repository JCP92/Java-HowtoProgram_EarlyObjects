// Fig. 3.13: NameDialog.java
// Using JOptionPane to display multiple lines in a dialog box.
import javax.swing.JOptionPane;

public class NameDialog{
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("What is your name?");
		
		String message = String.format("Welcome, %s, to Java Programming!", name);
		
		JOptionPane.showMessageDialog(null, message);
	}// end main
}// end of class NameDialog