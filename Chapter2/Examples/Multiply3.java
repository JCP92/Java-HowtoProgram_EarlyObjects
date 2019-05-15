//fig. 2.1: Multiply3.java
//Addition program that inputs two numbers then displayes their sum
import java.util.Scanner;

public class Multiply3{
   //main metho beigins execution of java app
   public static void main(String[] args){
      //create a scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      int num1;
      int num2;
      int num3;
      int sum;

      System.out.print("Enter first integer: ");
      num1 = input.nextInt();
      
      System.out.print("Enter second integer: ");
      num2 = input.nextInt();
      
      System.out.print("Enter third integer: ");
      num3 = input.nextInt();

      sum = num1 * num2 * num3;
   
      System.out.printf("%d * %d * %d = %d%n", num1, num2, num3, sum);
      
   }//end of main

}//end of class Multiply3