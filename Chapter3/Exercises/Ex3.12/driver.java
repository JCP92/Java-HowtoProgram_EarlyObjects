//InvoiceDriver.java
import javax.swing.JOptionPane;

public class driver{
	public static void main(String[] args){
		Invoice myInvoice = new Invoice();
		
		// set part number by directly using the input log
		myInvoice.setPartNumber(JOptionPane.showInputDialog("Insert part number"));
		
		// set description number by directly using the input log
		myInvoice.setPartDescription(JOptionPane.showInputDialog("Insert part description"));
		
		// Must convert string to number after receiving it
		String number = JOptionPane.showInputDialog("How many of the item?");
		myInvoice.setQuantity(Integer.parseInt(number));
		
		// Must convert string to number after receiving it
		String dollar = JOptionPane.showInputDialog("How much for the item?");
		myInvoice.setCostPerItem(Double.parseDouble(dollar));
		
		// store in message to out put GUI
		String message = String.format("Part Number:\t %s%nPart Description:\t %s%nQuantity: \t%d%n" +
									   "Cost per Item:\t $%.2f%nTotal Cost:\t $%.2f%n", myInvoice.getPartNumber(),
										myInvoice.getPartDescription(), myInvoice.getQuantity(), 
										myInvoice.getCostPerItem(), myInvoice.getInvoiceAmount());
										
		JOptionPane.showMessageDialog(null, message);

	}//end main
}//end driver class