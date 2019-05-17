// private String firstName;
import java.util.Date;
import java.time.LocalDate;
	
public class HealthProfile{	
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private int day;
	private int month;
	private int year;
	private int height;
	private int weight;
		
	HealthProfile(String firstName, String lastName, String gender, int month, int day, int year,
			  int height, int weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.month = month;
		this.day = day;
		this.year = year;
		this.height = height;
		this.weight = weight;
		
		age = calcAge();
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
	
	//getter and setter gender
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
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
	
	// get/set height
	public int getHeight(){
		return height;
	}
	public void setHeight(int height){
		this.height = height;
	}
	
	// get/set weight
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	public int calcAge(){
		LocalDate currentDate = LocalDate.now();
		
		age = currentDate.getYear() - year;
		
		if(currentDate.getMonthValue() < month)
			return (age - 1);
		else if(currentDate.getMonthValue() > month)
			return age;
		else{
			if(currentDate.getDayOfMonth() > day)
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
	
	public float calcBMI(){
		return (float)(weight * 703) / (float)(height * height);
	}
	  
   
	
}//end class