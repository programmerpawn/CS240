package leeAssignement1;
/**
 * 
 * @author Pong Lee
 *
 */

public class movie {
	private String name;
	private String directorName;
	private int genre;
	private double earnings;
	

	public movie(String name, String directorName, int genre, double earnings) {
		this.name = name;
		this.directorName = directorName;
		this.genre = genre;
		this.earnings = earnings;
		}
	
	//Getters/Setters for all instance variables
	
	/**
	 * 
	 * returns the name of the movie
	 * @name
	 * returns the director's name
	 * @directorName
	 * returns the genre selected for viewing
	 * @genre
	 * 
	 */
	public String getName() {
		return name;
	}
	
	private void setName(String newName) {
		this.name = newName;
	}
	
	public String getDirectorName() {
		return directorName;
	}
	
	private void setDirectorName(String newDirectorName) {
		this.directorName = newDirectorName;
	}
	
	public int getGenre() {
		return genre;
	}
	
	private void setGenre(int newGenre) {
		this.genre = newGenre;
	}
	
	public double addToEarning()
	{
		return earnings;
		
	}
	
	public boolean equals(movie obj) {
		return (this.getName().equalsIgnoreCase(obj.getName()));
	}
	
	
	public String toString() {
		return (this.name + "\t" + this.directorName + "\t" + this.genre);
		
	}

	public void setEarnings(double newEarnings) {
		this.earnings = newEarnings;
		
	}

	public double getEarnings() {
		return earnings;
	}
	
	
	
	
}
