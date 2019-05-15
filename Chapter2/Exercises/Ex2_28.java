//Ex2_28.java
/*Diamer, Circumference and Area of a Circle). Write an application that inputs from the user 
the radius of circle as an integer and prints the circle's diameter, circumference and area using
the floating-poin value of 3.14159 for pi.*/

import java.util.Scanner;
import java.lang.Math;

public class Ex2_28{
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

}//end of class Ex2_28