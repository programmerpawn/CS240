/**
 * 
 * @author Pong Lee
 *
 */
public class AudioCD extends SalesItem{
	private String label;
	private int playingTime;
	
	
	public AudioCD(int code, double price, int quantity,String label,int playingTime) {
		super(code, price, quantity);
		this.label = label;
		this.playingTime = playingTime;
	}

	public String getLabel() {
		return label;
	}
	
	public int getPlayingTime() {
		return playingTime;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}
	

	@Override
	/*
	 * Displays monthly promo for cd's
	 */
	public void monthlyPromo() {
		//An implementation of the monthlyPromo method where, for a CD, a price reduction of 5%
		// applied each month.
		double CDPromo;
		CDPromo =  getPrice() - (getPrice() * .05);
		System.out.println(CDPromo);
		
	}
	
	@Override
	public String toString() {
		String CDName = "";
		CDName += this.getCode() + "\t";
		CDName += this.getPrice()+ "\t";
		CDName += this.getQuantity()+ "\t";
		CDName += this.label + "\t";
		CDName += this.playingTime+ "\t" + "\n";
		return CDName;
	}
	
	
}
