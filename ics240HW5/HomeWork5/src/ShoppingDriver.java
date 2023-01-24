/**
 * 
 * @author Pong Lee
 *
 */
public class ShoppingDriver extends Dictionary{
	
	public ShoppingDriver (int code, double price, int quantity, String author, int numPages, String language, int numDefinitions) {
		super(code, price, quantity, author, numPages, language, numDefinitions); 

		
	}

	public static void main(String[] args) {
		 
		SalesItem[] newList = new SalesItem[5];
	
		newList[0] = new Dictionary(1,2.25,3,"Tim Honks",100,"english",33);
		newList[1] = new Book(2,33.3,2,"Betty Wright",22);
		newList[2] = new AudioCD(3,15.25,5,"RCA",45);
		newList[3] = new Book(2,24,10,"Mark", 150);
		newList[4] = new Dictionary(1,55.75,1,"Mr.Andersons",1500,"French",200);
		
		
		
		System.out.println("Items discount");
		ItemDiscount d = new ItemDiscount(15,10);
		d.calculateDiscount(newList[3]);
		d.calculateDiscount(newList[2]);
		System.out.println();
		
		
		System.out.println("Monthly Promo");
		for (int i = 0; i < newList.length;++i) {
			System.out.print(newList[i]);
			System.out.print("Promo added" + " $"); 
			newList[i].monthlyPromo() ;
		}
		
		
		System.out.println();
		
		
		Cart numTot = new Cart(5);
		numTot.add(newList[0]);
		numTot.add(newList[1]);
		numTot.add(newList[2]);
		numTot.add(newList[3]);
		numTot.add(newList[4]);
		System.out.println(numTot.toString());
		System.out.println(numTot.cartTotalCost());
		
		
		
		
	}


}
