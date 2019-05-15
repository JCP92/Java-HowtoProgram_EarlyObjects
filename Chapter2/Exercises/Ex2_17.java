//fig. 2.1: Ex2_17.java
/*Write an application that inputs three itnegers from the user and displays the sum, average, product,
smalles and largest of the numbers. */

import java.util.Scanner;

public class Ex2_17{
   //main metho beigins execution of java app
   public static void main(String[] args){
      //create a scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      int num1;
      int num2;
      int num3, sum, answer;


      System.out.print("Enter first integer: ");
      num1 = input.nextInt();
      
      System.out.print("Enter second integer: ");
      num2 = input.nextInt();
      
      System.out.print("Enter third integer: ");
      num3 = input.nextInt();
     
      sum = num1 + num2 + num3;
      System.out.printf("Addition: %d + %d + %d = %d%n", num1, num2, num3, sum);

      answer = num1 * num2 * num3;
      System.out.printf("Product: %d * %d * %d = %d%n", num1, num2, num3, answer);

      answer = num1 - num2 - num3;
      System.out.printf("Subtraction: %d - %d - %d = %d%n", num1, num2, num3, answer);  
      
      answer = sum / 3;
      System.out.printf("Average: %d / 3 = %d%n", sum, answer);      
      
      if(num1 < num2){// Smallest number
         if(num1 < num3)
            System.out.println("Smallest Number is: " + num1);
         else
            System.out.println("Smallest Number is: " + num3);
      }
      else{
         if(num2 < num3)
            System.out.println("Smallest Number is: " + num2);
         else
            System.out.println("Smallest Number is: " + num3);
      }// end of smallest number

      //Largest number
      if(num1 < num2){
         if(num2 < num3)
            System.out.println("Largest Number is: " + num3);
         else
            System.out.println("Largest Number is: " + num2);
      }
      else{
         if(num1 < num3)
            System.out.println("Largest Number is: " + num3);
         else
            System.out.println("Largest Number is: " + num1);
      }// end largest number
  
      
   }//end of main

}//end of class Ex2_17