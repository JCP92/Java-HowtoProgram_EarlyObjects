//DateTest.java
import javax.swing.JOptionPane;

public class DateTest{
	public static void main(String[] args){
		Date a = new Date();
		
		setDate(a);
		
		JOptionPane.showMessageDialog(null, a.displayDate());
		

	}//end main
	
	public static void setDate(Date dy){
		dy.setDay(Integer.parseInt(JOptionPane.showInputDialog("Day:")));
		dy.setMonth(Integer.parseInt(JOptionPane.showInputDialog("Month:")));
		dy.setYear(Integer.parseInt(JOptionPane.showInputDialog("Year:")));
	}
	
}//end DateTest