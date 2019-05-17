// HealthProfileTest.java
// tests the HeartRate class
import javax.swing.JOptionPane;
import java.util.Date;
import java.time.LocalDate;

public class HealthProfileTest{
	public static void main(String[] args){
		String firstName = JOptionPane.showInputDialog("Enter first name:");
		String lastName = JOptionPane.showInputDialog("Enter Last name:");
		String gender = JOptionPane.showInputDialog("Male or Female:");
		int month = Integer.parseInt(JOptionPane.showInputDialog("Enter your birth month:"));
		int day = Integer.parseInt(JOptionPane.showInputDialog("Enter your birth day:"));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Enter your birth year:"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height in inches:"));
		int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter your weight in pounds:"));
		
		
		HealthProfile member = new HealthProfile(firstName, lastName, gender, month, day, year, height, weight);
		
		String message = String.format("Name: %s %s%n" + "Your Gender: %s%n" + "Your Birthday: %s%n" + "Your Age: %d%n" + 
									   "Your height: %d%n" + "Your Weight: %d%n" + "BMI: %.2f%n" + 
									   "Max Heart Rate: %d%n" +
									   "Target Heart Range: %d to %d%n", member.getFirstName(),
		                               member.getLastName(), member.getGender(),  member.displayDate(), 
									   member.getAge(), member.getHeight(), member.getWeight(), 
									   member.calcBMI(),member.maxHR(),
									   member.targetHRMin(), member.targetHRMax());
		
		JOptionPane.showMessageDialog(null, message);
	}// end main
}//end HeartRateTest