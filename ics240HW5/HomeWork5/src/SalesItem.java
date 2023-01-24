/**
 * 
 * @author Pong Lee
 *
 */
public abstract class SalesItem {
	
	private int code;
	private double price;
	private int quantity;
	
	
	public SalesItem(int code, double price, int quantity) {
		this.code = code;
		this.price  = price;
		this.quantity = quantity;
	}
	//getters
	public int getCode() {
		return code;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	//setters
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 *returns total cost of all items in the list 
	 * @param price and quantity
	 */
	public static double itemTotalCost(double price, int quantity) {
		return price*quantity;
	}
	
	public abstract void monthlyPromo();
	
	/**
	 * returns a string for the sales of item
	 * 
	 */
	public String toString() {
		String itemName = "";
		itemName += this.code + "\t"; 
		itemName += this.price + "\t";
		itemName += this.quantity + "\n";
		return itemName;
	}
	
	
	
}
