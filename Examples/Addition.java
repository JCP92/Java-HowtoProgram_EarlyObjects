//fig. 2.1: Addition.java
//Addition program that inputs two numbers then displayes their sum
import java.util.Scanner;

public class Addition {
   //main metho beigins execution of java app
   public static void main(String[] args){
      //create a scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      int num1;
      int num2;
      int sum;

      System.out.print("Enter first integer: ");
      num1 = input.nextInt();
      
      System.out.print("Enter second integer: ");
      num2 = input.nextInt();
      
      sum = num1 + num2;
   
      System.out.printf("Sum is %d%n", sum);
      
   }//end of main

}//end of class Addition