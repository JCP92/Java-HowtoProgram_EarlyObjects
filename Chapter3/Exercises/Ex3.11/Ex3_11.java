//fig. 3.11: Ex3_11.java
//Addition program that inputs two numbers then displayes their sum
import javax.swing.JOptionPane;

public class Ex3_11{
   //main metho beigins execution of java app
   public static void main(String[] args){
      //create a scanner to obtain input from the command window
	  
      String firstNum = JOptionPane.showInputDialog("What is the first number?");
	  String secondNum = JOptionPane.showInputDialog("What is the second number?");
	  
      int num1 = Integer.parseInt(firstNum);
	  int num2 = Integer.parseInt(secondNum);
	  
	  int sum = num1 + num2;
	  
	  String message = String.format("%d + %d = %d%n%n", num1, num2, sum);
	  
	  JOptionPane.showMessageDialog(null, message);
   }//end of main
}//end of class Ex3_11