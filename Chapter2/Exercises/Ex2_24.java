//fig. 2.1: Ex2_24.java
/*Largest and smallest Integers. Write an applciaiton that reads five integers and determines
and prints the largest and smallest ingers in the group. Use only the programming techniques 
you learned in this chapater. */

import java.util.Scanner;

public class Ex2_24{
   //main metho beigins execution of java app
   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      int num1, num2, num3, num4, num5, largest, smallest;

      System.out.print("Enter first integer: ");
      num1 = input.nextInt();
      
      System.out.print("Enter second integer: ");
      num2 = input.nextInt();
      
      System.out.print("Enter third integer: ");
      num3 = input.nextInt();

      System.out.print("Enter fourth integer: ");
      num4 = input.nextInt();
      
      System.out.print("Enter fifth integer: ");
      num5 = input.nextInt();
      
      if(num1 < num2){
         smallest = num1;
         largest = num2;
      }
      else{
	 smallest = num2;
         largest = num1;
      }

      // determine smallest
      if(num3 < smallest)
	 smallest = num3;
      if(num4 < smallest)
  	 smallest = num4;
      if(num5 < smallest)
	 smallest = num5;

      // determine largest
      if(largest < num3)
	 largest = num3;
      if(largest < num4)
  	 largest = num4;
      if(largest < num5)
	 largest = num5;

      System.out.println("Smallest Number: " + smallest + "\nLargest Number: " + largest);

   }//end of main

}//end of class Ex2_24