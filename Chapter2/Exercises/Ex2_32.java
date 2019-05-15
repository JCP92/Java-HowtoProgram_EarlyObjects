//Ex2_32.java
/*Negative, Positive and Zero Values. Write a program that inputs five numbers and determines and prints
the number of negative numbers input, the number of positive numbers input and the number of zeros input.
 */

import java.util.Scanner;
import java.lang.Math;

public class Ex2_32{
   //main metho beigins execution of java app
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);

   int num1, num2, num3, num4, num5, positive, negative, zero;
   positive = negative = zero = 0;

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

   if(num1 >= 0)
      positive++;
   else
     negative++;
   if(num1 == 0)
     zero++;

   if(num2 >= 0)
      positive++;
   else
     negative++;
   if(num2 == 0)
     zero++;

   if(num3 >= 0)
      positive++;
   else
     negative++;
   if(num3 == 0)
     zero++;

   if(num4 >= 0)
      positive++;
   else
     negative++;
   if(num4 == 0)
     zero++;

   if(num5 >= 0)
      positive++;
   else
     negative++;
   if(num5 == 0)
     zero++;
   
   System.out.printf("Negative: %d\nPositive: %d\nZeroes: %d\n", negative, positive, zero);

   }//end of main

}//end of class Ex2_32