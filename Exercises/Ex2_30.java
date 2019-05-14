//Ex2_30.java
/*Integer Value of a Character. */

import java.util.Scanner;
import java.lang.Math;

public class Ex2_30{
   //main metho beigins execution of java app
   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
 
      int radius;

      System.out.print("Please insert the radius: ");
      radius = input.nextInt();


      System.out.printf("Diameter: %d\n", (radius * 2));
      System.out.printf("Circumference: %f\n",(Math.PI * radius * 2));
      System.out.printf("Area: %f\n", (Math.PI * radius * radius));

   }//end of main

}//end of class Ex2_30