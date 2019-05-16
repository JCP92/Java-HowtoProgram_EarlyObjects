//Fig 3.1: Account.java
//Account class that contains a name instance variable
// and methods to set and get its value.

public class Account{
	private String name; //instance variable
	private double balance; //instance variable
	
	// constructor initialized name with parameter name
	public Account(String name, double balance){
		this.name = name;
		
		//validate that the balance is greater than 0.0
		if(balance > 0.0)
			this.balance = balance;
	}
	
	//method that deposites money
	public void deposit(double depositAmount){
		balance += depositAmount;
	}
	
	//method that gets balance
	public double getBalance(){
		return balance;
	}
	//method to set the name in the object 
	public void setName(String name){
		this.name = name;
	}//end setName
	
	public String getName(){
		return name;
	}// end getName
	
	public void displayAccount(){
		System.out.printf("%s balance: %.2f%n", name, balance);
	}//end displayAccount
}//end of class