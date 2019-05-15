//Ex2_33BMICalc.java
/*Negative, Positive and Zero Values. Write a program that inputs five numbers and determines and prints
the number of negative numbers input, the number of positive numbers input and the number of zeros input.
 */

import java.util.Scanner;
import java.lang.Math;

public class Ex2_33BMICalc{
   //main metho beigins execution of java app
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   int decision;
   
   System.out.print("Do you want to want to use pounds and inchese (please use 1 for yes and 0 for no): ");
   decision = input.nextInt(); 
   float BMI;
   if(decision == 1){
      int weightInPounds, heightInInches;
      
      System.out.print("Please insert your current weight in pounds: ");
      weightInPounds = input.nextInt();

      System.out.print("Please insert your current height in inches: ");
      heightInInches = input.nextInt();

      BMI = (float)(weightInPounds * 703) / (float)(heightInInches * heightInInches);
      System.out.printf("Your BMI is: %f\n", BMI);

      if(BMI < 18.5)
         System.out.println("Underweight");
      else if(BMI >= 18.5 && BMI <= 24.9)
         System.out.println("Normal");
      else if(BMI >= 25 && BMI <= 29.9)
         System.out.println("Overweight");
      else if(BMI >= 30)
         System.out.println("Overwight");
   
   }// end of weight in pounds and height inches
   else{
      float weightInKilograms, heightInMeters;
      
      System.out.print("Please insert your current weight in kgs: ");
      weightInKilograms = input.nextFloat();

      System.out.print("Please insert your current height in meters: ");
      heightInMeters = input.nextFloat();

      BMI = weightInKilograms / (heightInMeters * heightInMeters);
      System.out.printf("Your BMI is: %f\n", BMI);

      if(BMI < 18.5)
         System.out.println("Underweight");
      else if(BMI >= 18.5 && BMI <= 24.9)
         System.out.println("Normal");
      else if(BMI >= 25 && BMI <= 29.9)
         System.out.println("Overweight");
      else if(BMI >= 30)
         System.out.println("Overwight");
   }//end of weight in kg and heigh in meters


   }//end of main

}//end of class Ex2_33BMICalc