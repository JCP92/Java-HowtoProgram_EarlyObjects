//Employee.java
//Addition program that inputs two numbers then displayes their sum
import javax.swing.JOptionPane;

public class Employee{
	private String firstName;
	private String lastName;
	private double salary;
		
	Employee(){
		this.firstName = null;
		this.lastName = null;
		this.salary = 0.00;
	}//end of constructor
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String name){
		firstName = name;
	}
	
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String name){
		lastName = name;
	}
	
	public double getSalary(){
		return salary;
	}
	public void setSalary(double value){
		if(value > 0.00)
			salary = value;
	}
}//end of class Employee