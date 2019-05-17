// Fig. 3.2: AccountTest.java
// Creating and manipulating an Account object

import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		// create a Scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// prompt for and read name
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		// display the name stored in object myAccount 
		displayAccount(account1);
		displayAccount(account2);
		
		deposit(account1, input);
		
		displayAccount(account1);
		displayAccount(account2);
		
		deposit(account2, input);
		
		displayAccount(account1);
		displayAccount(account2);


	}//end main
	
	public static void displayAccount(Account thisOne){
		System.out.printf("%s balance: %.2f%n", thisOne.getName(), thisOne.getBalance());
	}//end displayAccount
	
	public static void deposit(Account thisOne, Scanner input){
		System.out.printf("Enter deposit amount for %s: ", thisOne.getName());
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to %s balance %n%n", depositAmount, thisOne.getName());
		thisOne.deposit(depositAmount);
	}
	
}// end of AccountTest Class