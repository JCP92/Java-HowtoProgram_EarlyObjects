//Date.java
//formats date

public class Date{
	private int day;
	private int month;
	private int year;
		
	Date(){
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}//end of constructor
	
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		this.day = day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public String displayDate(){
		return String.format("%d/%d/%d", month, day, year);
	}
}//end of class Date