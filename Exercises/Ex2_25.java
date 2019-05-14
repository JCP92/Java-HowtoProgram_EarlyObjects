//Ex2_25.java
/*Odd or Even. Write an applicaiotn that reads an integer and determinews and prints whether it's
odd or even.*/

import java.util.Scanner;

public class Ex2_25{
   //main metho beigins execution of java app
   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      int num;

      System.out.print("Enter first integer: ");
      num = input.nextInt();
      
      if(num % 2 == 0)
         System.out.println("Is an even number");
      else
         System.out.println("Is an odd number");

   }//end of main

}//end of class Ex2_25