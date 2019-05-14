//Ex2_26.java
/*Multiples. Write an applcaiotn that reads two integers, determines whether the first is a 
multiple of the second and prints the result.*/

import java.util.Scanner;

public class Ex2_26{
   //main metho beigins execution of java app
   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      int num1, num2;

      System.out.print("Enter first integer: ");
      num1 = input.nextInt();
      
      System.out.print("Enter second integer: ");
      num2 = input.nextInt();      

      if(num2 % num1 == 0)
         System.out.printf("%d is a multiple of %d.\n", num1, num2);
      else
         System.out.printf("%d is not a multiple of %d.\n", num1, num2);

   }//end of main

}//end of class Ex2_26