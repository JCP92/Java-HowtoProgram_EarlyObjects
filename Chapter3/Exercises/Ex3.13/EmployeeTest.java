//EmployeeTest.java
import javax.swing.JOptionPane;

public class EmployeeTest{
	public static void main(String[] args){
		Employee a = new Employee();
		Employee b = new Employee();
		
		setEmployeesInfo(a);
		setEmployeesInfo(b);
		
		displaySalary(a);
		displaySalary(b);
		
		giveRaise(a);
		giveRaise(b);
		
		displaySalary(a);
		displaySalary(b);
		

		

	}//end main
	
	public static void setEmployeesInfo(Employee emp){
		emp.setFirstName(JOptionPane.showInputDialog("First Name:"));
		emp.setLastName(JOptionPane.showInputDialog("Last Name: "));
		String number = JOptionPane.showInputDialog("Yearly Salary: ");
		emp.setSalary(Integer.parseInt(number));
	}
	
	public static void displaySalary(Employee emp){
		String message = String.format("First Name:\t %s%nLast Name:\t %s%n" +
									   "Yearly Salary:\t $%.2f%n", emp.getFirstName(),
										emp.getLastName(), emp.getSalary());
										
		JOptionPane.showMessageDialog(null, message);
	}
	public static void giveRaise(Employee emp){
		emp.setSalary(emp.getSalary() * 1.10);
	}
}//end EmployeeTest