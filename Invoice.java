/*
 * Name: Richard Boyd
 * Date: 8/30/19 
 * Description: Exercise 3.12 Invoice Class
 */

public class Invoice {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;

	public Invoice(String partnumber, String partdescription, int quantity, double price) {
		this.partNumber = partnumber;
		this.partDescription = partdescription;
		if (quantity < 0) {
			quantity = 0;
		}
		this.quantity = quantity;
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public void setPartNumber(String partnumber) {
		this.partNumber = partnumber;
	}

	public String getPartnumber() {
		return partNumber;
	}

	public void setPartDescription(String partdescription) {
		this.partDescription = partdescription;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double getInvoiceAmount() {
		double invoiceAmount;
		invoiceAmount = quantity * price;
		return invoiceAmount;
	}
}
