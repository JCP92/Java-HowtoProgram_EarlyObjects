//fig. 3.1: Addition.java
//Addition program that inputs two numbers then displayes their sum
import javax.swing.JOptionPane;

public class Addition {
   //main metho beigins execution of java app
   public static void main(String[] args){
      //create a scanner to obtain input from the command window
	  
      String firstNum = JOptionPane.showInputDialog("What is the first number?");
      int num1 = Integer.parseInt(firstNum);
	  String message = String.format("The number you input was %d%n%n", num1);
	  
	  JOptionPane.showMessageDialog(null, message);
   
      
   }//end of main

}//end of class Addition