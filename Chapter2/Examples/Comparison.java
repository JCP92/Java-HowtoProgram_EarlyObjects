//fig. 2.1: Comparison.java
//Addition program that inputs two numbers then displayes their sum
import java.util.Scanner;

public class Comparison{
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
         System.out.printf("%d == %d%n", num1, num2);

      if(num1 != num2)
         System.out.printf("%d != %d%n", num1, num2);

      if(num1 < num2)
         System.out.printf("%d < %d%n", num1, num2);

      if(num1 > num2)
         System.out.printf("%d > %d%n", num1, num2);

      if(num1 <= num2)
         System.out.printf("%d <= %d%n", num1, num2);

      if(num1 >= num2)
         System.out.printf("%d >= %d%n", num1, num2);
   
      
   }//end of main

}//end of class Comparison