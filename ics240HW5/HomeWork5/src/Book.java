/**
 * 
 * @author Pong Lee
 *
 */
public class Book extends SalesItem {
	private String author;
	private int numPages;
	
	public Book(int code, double price, int quantity,String author, int numPages) {
		super(code,price,quantity);
		this.author = author ;
		this.numPages = numPages;
		
	}
	public String getAuthor(){
		return author;
	}
	
	public int getNumPages() {
		return numPages;
	}
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	public void setNumPages(int newNumPages) {
		this.numPages = newNumPages;
	}
	
	
	/**
	 * 
	 * Method that when called and printed out displays the monthly promo for book
	 */
	@Override
	public void monthlyPromo() {
		//An implementation of the monthlyPromo method where, for a book, a price reduction of
		//3% is applied each month. 
		double promo = .03;
		double total = 0;
		total = getPrice() - (getPrice() * promo);
		System.out.println(total);
		
	}
	
	@Override
	public String toString() {
		String bookName = "";
		bookName += this.getCode() + "\t";
		bookName +=	this.getPrice() + "\t";
		bookName +=	this.getQuantity()+ "\t";
		bookName +=	this.author+ " \t";
		bookName +=	this.numPages+ " \t" + "\n";
		return bookName;
	}
	
	
}
