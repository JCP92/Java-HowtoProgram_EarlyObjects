//Ex2_35CarPoolSavCalc.java
/* Use the web to determin the current world popluation and the annual world population growth rate.
Write an Applicaiton that inputs these values then displays estimated population after one, two, 
three, four, and five years.
*/

import java.util.Scanner;
import java.lang.Math;

public class Ex2_35CarPoolSavCalc{
   
   public static void main(String[] args){

   Scanner input = new Scanner(System.in);

   int milesPerDay, averageMilesPerGallon;
   double costPerGallon, parkingFeesPerDay, tollsPerDay, gasUsed, costOfGas, totalPerDay;

   System.out.print("How many miles do you drive per day: ");
   milesPerDay = input.nextInt();
   
   System.out.print("Average milese per gallon: ");
   averageMilesPerGallon = input.nextInt();

   System.out.print("How much does it cost per gallon: ");
   costPerGallon = input.nextDouble();

   System.out.print("How much in Parking Fees per day: ");
   parkingFeesPerDay = input.nextDouble();

   System.out.print("How much in tolls per day: ");
   tollsPerDay = input.nextDouble();

   gasUsed = milesPerDay / (float)(averageMilesPerGallon);
   System.out.printf("You are using %f gallons of gas per day.\n", gasUsed);

   costOfGas = gasUsed * costPerGallon;
   System.out.printf("This is costing you %f per day.\n", costOfGas);

   totalPerDay = costOfGas + parkingFeesPerDay + tollsPerDay;
   System.out.printf("You are spending approximately $ %f per day\n", totalPerDay);

   System.out.printf("Carpooling with one additional person will cut this in half " +
                     "where you are only paying $ %f per day\n", (totalPerDay/2));    

   }//end of main

}//end of class Ex2_35CarPoolSavCalc