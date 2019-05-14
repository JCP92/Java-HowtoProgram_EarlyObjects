//fig. 2.1: Ex2_16.java
/*Write an applicaiton that asks the user to enter towo integers, obtains them
 from teh user and displays the larger number followed by the words "is larger". 
If the numbers are equal, print the message "Thesse Numbers are equal".*/

import java.util.Scanner;

public class Ex2_16{
   //main metho beigins execution of java app
   public static void main(String[] args){
      //create a scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      int num1;
      int num2;


      System.out.print("Enter first integer: ");
      num1 = input.nextInt();
      
      System.out.print("Enter second integer: ");
      num2 = input.nextInt();
      
      if(num1 == num2)
         System.out.println("These numbers are equal");
      else if(num1 < num2)
         System.out.printf("%d is greater than %d%n", num2, num1);
      else
         System.out.printf("%d is greater than %d%n", num1, num2);
      
   }//end of main

}//end of class Ex2_16