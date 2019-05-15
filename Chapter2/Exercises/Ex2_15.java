//fig. 2.1: Ex2_15.java
/* (Arithmetic) Write an applicaiotn that saks the user to enter two integers , 
obtains them from the user and prints their sum, product, difference and quotient.  
Use the techinques shown in fig 2.7 */


import java.util.Scanner;

public class Ex2_15{
   //main metho beigins execution of java app
   public static void main(String[] args){
      //create a scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      Double num1;
      Double num2;
      Double answer;

      System.out.print("Enter first integer: ");
      num1 = input.nextDouble();
      
      System.out.print("Enter second integer: ");
      num2 = input.nextDouble();
      
      answer = num1 + num2;
      System.out.printf("Addition: %f + %f = %f%n", num1, num2, answer);

      answer = num1 * num2;
      System.out.printf("Product: %f * %f = %f%n", num1, num2, answer);

      answer = num1 - num2;
      System.out.printf("Subtraction: %f - %f = %f%n", num1, num2, answer);  
      
      answer = num1 / num2;
      System.out.printf("division: %f / %f = %f%n", num1, num2, answer);
   }//end of main

}//end of class Ex2_15