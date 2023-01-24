/**
 * 
 * @author Pong Lee
 *
 */
public class Cart {
	
	private SalesItem[] itemList;
	private int numItems;
	
	public Cart() {
		this.itemList = new SalesItem[10];
		this.numItems = 0;
	}
	
	public Cart(int capacity) {
		
		this.itemList = new SalesItem[capacity]; //default of 5 items
		this.numItems =  0;
		
	}

	
	/**
	 * Adding an element to the collection
	 * @param element to be added
	 */
	public void add(SalesItem element) {
		
		this.itemList[this.numItems] = element;
		this.numItems++;
		
	}
	
	
	public int size(){
		
		return this.numItems;
	}
	/**
	 * 
	 * gets the total cost for the cart
	 * @return
	 */
	public double cartTotalCost() {
		//a method that returns the total cost of all items in the cart
		double totalItem = 0;
		for(int i = 0; i < itemList.length; ++i) {
			totalItem += numItems;
		}
		return totalItem;
		
	}
	
	public int getAtIndex(int index) {
		//a method that takes an input parameter of type integer that represents an
		//array index and returns the SalesItem object that is located at this index in the itemsList
		//array. The method returns null if the input index is not a valid index.
		for(int i = 0; 0 < this.itemList.length; ++i) {
			if(index == i) {
				return index;
			}
			else {
				return (Integer) null;
			}
		}
		return index;
	}
	
	
	public String countType(int itemType) {
		/*a method that takes as input one integer that represents the type of items to be
		counted where 1 means Book, 2 means Dictionary, and 3 means AudioCD. The method
		then counts how many items of this type are there in the cart. For example, if the input is 1
		and the cart has an item of type Book and quantity 2 then this adds 2 the output count. The
		method returns 0 for any input value other than 1,2, or 3. 
		*/
		
		String isBook = "book";
		String isDictionary = "Dictionary";
		String isCD = "AudioCD";
		
		for ( int i = 0; i < this.itemList.length; ++i) {
			if (itemType == 1) {
				return isBook;
			}
			else if(itemType == 2) {
				return isDictionary;
			}
			else if (itemType == 3) {
				 return isCD;
			}
				else{
					return null;
			}
		}
		return null;
		
	}
	
	public String toString() {
		String  outPut = "Items\tPrice\tQuanitiy\tauthor\tnumPages\tlanguage\tnumDefinitions\n";
		outPut += "----------------------------------------------------------------------------------------\n";
		//a method that prints a nicely formatted output of the cart where each item is
		//printed in one line. The method also prints the cart's total cost.
		for ( int i = 0; i < this.numItems; i++) {
			outPut = outPut + this.itemList[i];
					
		}
		
		return outPut;
		
	}
	
	
	
	
	
	
	
}
