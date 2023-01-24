package leeAssignement1;
import java.util.Arrays;
/**
 * 
 * @author Pong Lee
 *
 */
public class distributor {
	
	//Instance variables 
	
	private static String name = "";
	private String address ="";
	private String phone = "";
	private movie[] movies;
	private int numMovies = 0;
	
	
	public distributor() {
		this.name = "";
		this.address = "";
		this.phone = "";
		this.movies = new movie[5];
		this.numMovies = 0;
	}
	
	
	public distributor(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.movies = new movie[5];
		this.numMovies = 0;
		
	}
	
	
	//Getters and setters
	public String getName() {
		return name;
	}
	
	private void setName(String newName) {
		this.name = newName;
	}
	
	public String getAddress() {
		return address;
	}
	
	private void setAddress(String newAddress) {
		this.address = newAddress;
	}
	public String getPhone() {
		return phone;
	}
	
	private void setPhone(String newPhone) {
		this.phone = newPhone;
	}
	
	/*
	 * Gets the copy of the array of movies
	 * @movies[]
	 * returns array of movies
	 * 
	 */
	public movie[] getMovies() {
		return Arrays.copyOf(movies, numMovies);
	}
	
	/*
	 * adds movies to the movie array 
	 * @addMoive
	 * 
	 */
	public boolean addMovie(movie movie) {
		if (this.numMovies > this.movies.length) {
			return false;
		}
		else {
			this.movies [this.numMovies++] = movie;
			return true;
		}
	}
	
	/*
	 * returns the input or the hard code of what the user inputs for addMovie
	 * @addMovie
	 * 
	 */
	public boolean addMovie(String name, String directorName,int genre, double earnings) {
		if(this.numMovies > this.movies.length) {
			return false;
		}
		else {
			movie movie1 = new movie( name, directorName,genre, earnings);
			this.movies[this.numMovies++] = movie1;
			return true;
			}
	}
	
	public int getNumMovies() {
		return this.numMovies;
	}
	
	/*
	 * Gets the total earnings from the user
	 * @totalEarning
	 * 
	 */
	public double totalEarning() {
		double total = 0;
		for (int i = 0; i < this.numMovies; i++) {
			total += this.movies[i].getEarnings(); 
		}
		return total;
	}
	
	/*
	 * Gets the total earnings for movies that are comedy
	 * @comedyEarnings
	 * 
	 */
	public double comedyEarnings() {
		double total = 0 ;
		for (int i = 0; i < this.numMovies; i++) {
			if(this.movies[i].getGenre() == 0) {
				total += this.movies[i].getEarnings();
			}
			
		}
		return total;
	}
	
	/*
	 * Grabs the movie title and the amount of earnings and grabs the earnings and adds it to the totalEanring constructor
	 * @addEarnings
	 * 
	 */
	public boolean addEarnings(String movieName, double earnings) {
		
		int money = 0;
		boolean correct = false; 
		
		for (int i = 0; i < this.numMovies; i++) {
			
			if (this.movies[i] != null){
			
				if (this.movies[i].getName().equalsIgnoreCase(name)){
				money = i;
				correct = true;
				
				}	
			}
		}
		
		if(correct) {
			this.movies[money].setEarnings(this.movies[money].getEarnings() + earnings);
			return true;
		}
		else {
			return false;
		}
		
		}
	
	/*
	 * Checks to see what the movie is 
	 * @getNumGenre
	 * 
	 */
	public int getNumGenre(int genre) {
		int num = 0;
		
		for (int i = 0; i < this.numMovies; i++) {
			if(this.movies[i].getGenre() == genre) {
				num++;
			}
		}
		return num;
		
	}
	
	/*
	 * calculates the tax for the movie
	 * @calculateTax
	 * 
	 */
	public static double calculateTax(double tax, distributor distributor) {
		double totEarning = distributor.totalEarning();
		double finalTax = (totEarning * tax) / 100;
		return finalTax;
		
	}
	
	/*
	 * 
	 * Checks to make sure the distributors have different movies in the array
	 * @equals
	 */
    public boolean equals(distributor diffName){
        return (this.getName().equalsIgnoreCase(diffName.getName()));
    }
    
	/*
	 * Makes the output of the movies and distributor into a better looking formate
	 * @toString
	 * 
	 */
    public String toString() {
    	String repDis = "Distributor Name: " + this.name + "\n"
                + "Phone: " + this.phone + "\n"
                + "Number of movies: " + this.numMovies + "\n"
                + "ALL MOVIES:\n";
        
        for(int i = 0; i < this.numMovies; i++)
        {
        	repDis += this.movies[i] + "\n";
        }
        repDis += "Total earnings: $" + totalEarning();
        
        return repDis; 
    }
    
		
	}
	


