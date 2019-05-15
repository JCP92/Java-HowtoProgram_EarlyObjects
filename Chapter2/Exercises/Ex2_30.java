//Ex2_30.java
/*Separating the digits in an Integer. Write an applicaiton that inputs one number consisting of five
digits from teh suer, sperates teh number into its individual digits and prints the digits seperated
from one another by three spaces each. */

import java.util.Scanner;
import java.lang.Math;

public class Ex2_30{
   //main metho beigins execution of java app
   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
 
      int num1, num2, num3, num4, num5, original;

      System.out.print("Please insert a five number digit: ");
      original= input.nextInt();
      
      num5 = original % 10;
      original /= 10;

      num4 = original % 10;
      original /= 10;
 
      num3 = original % 10;
      original /= 10;

      num2 = original % 10;
      original /= 10;

      num1 = original % 10;

      System.out.printf("%d %d %d %d %d", num1, num2, num3, num4, num5);

   }//end of main

}//end of class Ex2_30