/**
 * 
 * @author Pong Lee
 *
 */
public class ItemDiscount {

	private int discount;
	private int qualifiedQuantity;

	public ItemDiscount(int discount, int qualifiedQuantity) {
		this.discount = discount;
		this.qualifiedQuantity = qualifiedQuantity;
	}
	
	/**
	 * 
	 * @param item
	 */
	public void calculateDiscount(SalesItem item) {
		double promo = 0;
		//a method that takes one input of type SalesItem. The method
		//checks whether the item’s quantity to decide whether the item is qualified for discount or no.
		//If the item is qualified, then the method returns a double value that represent amount of
		//money to be deducted from the item. For example, assume the store would like to apply 10%
		//discount if 5 or more entities of the same item are sold together. To implement that, the
		//following ItemDiscount object created.
		if(item.getQuantity() >= 10) {
			promo = item.getPrice() * .15;
			System.out.println("Promo discount: " + promo);
		}
		else {
			System.out.println("No discount");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
