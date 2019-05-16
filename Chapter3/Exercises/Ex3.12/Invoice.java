//Invoice.java
//Addition program that inputs two numbers then displayes their sum
import javax.swing.JOptionPane;

public class Invoice{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double costPerItem;
		
	Invoice(){
		this.partNumber = null;
		this.partDescription = null;
		this.quantity = 0;
		this.costPerItem = 0.00;
	}//end of constructor
	
	public String getPartNumber(){
		return partNumber;
	}
	public void setPartNumber(String number){
		partNumber = number;
	}
	
	public String getPartDescription(){
		return partDescription;
	}
	public void setPartDescription(String description){
		partDescription = description;
	}
	
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int number){
		if(number >= 0){
			quantity = number;
		}
	}
	
	public double getCostPerItem(){
		return costPerItem;
	}
	public void setCostPerItem(double value){
		if(value > 0.00){
			costPerItem = value;
		}
	}
	
	public double getInvoiceAmount(){
		return quantity * costPerItem;
	}
	
}//end of class Invoice
