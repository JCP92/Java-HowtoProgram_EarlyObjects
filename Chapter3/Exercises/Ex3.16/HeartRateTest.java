// HeartRateTest.java
// tests the HeartRate class
import javax.swing.JOptionPane;
import java.util.Date;
import java.time.LocalDate;

public class HeartRateTest{
	public static void main(String[] args){
		String firstName = JOptionPane.showInputDialog("Enter first name:");
		String lastName = JOptionPane.showInputDialog("Enter Last name:");
		int month = Integer.parseInt(JOptionPane.showInputDialog("Enter your birth month:"));
		int day = Integer.parseInt(JOptionPane.showInputDialog("Enter your birth day:"));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Enter your birth year:"));
		
		LocalDate currentDate = LocalDate.now();
		
		HeartRate check = new HeartRate(firstName, lastName, month, day, year,
		                                currentDate.getMonthValue(), currentDate.getDayOfMonth(),
										currentDate.getYear());
		
		String message = String.format("%s %s%nYour Birthda: %s%nYour Age: %d%nMax Heart Rate: %d%n" +
									   "Target Heart Range: %d to %d%n", check.getFirstName(),
		                               check.getLastName(), check.displayDate(), check.getAge(), check.maxHR(),
									   check.targetHRMin(), check.targetHRMax());
		
		JOptionPane.showMessageDialog(null, message);
	}// end main
}//end HeartRateTest