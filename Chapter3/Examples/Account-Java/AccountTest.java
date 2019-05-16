// Fig. 3.2: AccountTest.java
// Creating and manipulating an Account object

import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		// create a Scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// prompt for and read name
		System.out.println("Please enter the name: ");
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		// display the name stored in object myAccount 
		account1.displayAccount();
		account2.displayAccount();
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
		account1.deposit(depositAmount);
		
		account1.displayAccount();
		account2.displayAccount();
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount);
		account2.deposit(depositAmount);
		
		account1.displayAccount();
		account2.displayAccount();
		
				
	}//end main
}// end of AccountTest Class