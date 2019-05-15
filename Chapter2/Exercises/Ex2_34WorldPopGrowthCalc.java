//Ex2_34WorldPopGrowthCalc.java
/* Use the web to determin the current world popluation and the annual world population growth rate.
Write an Applicaiton that inputs these values then displays estimated population after one, two, 
three, four, and five years.
*/

import java.util.Scanner;
import java.lang.Math;

public class Ex2_34WorldPopGrowthCalc{
   
   public static void main(String[] args){
   long curWorldPop = 7346235000L;
   double popGrowthRate = 1.07;
   long futurePop = (long)(curWorldPop * popGrowthRate);

   System.out.printf("Year One: %d\n", futurePop);
   
   futurePop *= popGrowthRate;
   System.out.printf("Year Two: %d\n", futurePop);

   futurePop *= popGrowthRate;
   System.out.printf("Year Three: %d\n", futurePop);

   futurePop *= popGrowthRate;
   System.out.printf("Year Four: %d\n", futurePop);

   futurePop *= popGrowthRate;
   System.out.printf("Year Five: %d\n", futurePop);

   }//end of main

}//end of class Ex2_34WorldPopGrowthCalc