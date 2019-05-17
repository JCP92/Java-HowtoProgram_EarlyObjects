//HeartRate.java
//Stores employees information and salary

public class HeartRate{
	private String firstName;
	private String lastName;
	private int age;
	private int day;
	private int month;
	private int year;
		
	HeartRate(String firstName, String lastName, int month, int day, int year, int curMonth, int curDay, int curYear){
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
		
		age = calcAge(curMonth, curDay, curYear);
	}//end of constructor
	
	//getter setter first name
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String name){
		firstName = name;
	}
	
	//getter setter Last Name
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String name){
		lastName = name;
	}
	
	//getter setter day
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		this.day = day;
	}
	
	//getter setter month
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		this.month = month;
	}
	
	//getter setter year
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	
	//getter setter year
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.year = age;
	}
	
	//display date
	public String displayDate(){
		return String.format("%d/%d/%d", month, day, year);
	}
	
	public int calcAge(int curMonth, int curDay, int curYear){
		age = curYear - year;
		System.out.println(curMonth);
		if(curMonth < month)
			return (age - 1);
		else if(curMonth > month)
			return age;
		else{
			if(curDay > day)
				return (age - 1);
			else
				return age;
		}
	}//end calcage
	
	public int maxHR(){
		return (220 - age);
	}
	
	public int targetHRMax(){
		return (int)(0.80 * maxHR());
	}
	public int targetHRMin(){
		return (int)(0.50 * maxHR());
	}
	
}//end of class Employee