/**
 * 
 * @author Pong Lee
 *
 */
public class Dictionary extends Book {
	private String language;
	private int numDefinitions;
	
	public Dictionary(int code, double price, int quantity, String author, int numPages, String language, int numDefinitions) {
		super(code, price, quantity, author, numPages);
		
		this.language = language;
		this.numDefinitions = numDefinitions ;
	}
	
	public String getLanguage() {
		return language;
	}
	public int getNumDefinitions() {
		return numDefinitions;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setNumDefinitions(int numDefinitions) {
		this.numDefinitions = numDefinitions;
	}
	
	public String toString() {
		String dictionayName = "";
		dictionayName += this.getCode() + "\t";
		dictionayName += this.getPrice() + "\t";
		dictionayName += this.getQuantity() + "\t";
		dictionayName += this.getAuthor() + "\t";
		dictionayName += this.getNumPages() + "\t";
		dictionayName += this.language  + "\t";
		dictionayName += this.numDefinitions + "\t"+ "\n";
		return dictionayName;
	}
	/**
	 * returns a ratio of defintions from the number of pages
	 * @return
	 */
	public int getRatio() {
		//A method called getRatio that returns the number of definitions (on average) for each page
		//in the dictionary (i.e., number of definitions divided by the number of pages).
		int ratioThis = 0;
		ratioThis =  getNumDefinitions() / getNumPages();
		
		return ratioThis;
	}

}
