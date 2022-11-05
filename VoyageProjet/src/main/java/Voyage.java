

import java.util.List;

/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class Voyage 
{
    private static int id = 0;
    private Country country;

    /**
     * Constructor for objects of class Travel
     */
    public Voyage() {
        this.id++; 
    	this.country = new Country();
    }

    public Voyage(String country) {
        this.id++;
        this.country = new Country();
        this.extracted().setCountryName(country);
    }
    
    public int getId() {
        return this.id;
    }
    
    public Country getCountry() {
        return this.extracted();
    }

    public void setTravelMode(String travelMode) {
       extracted().addTravelModes(travelMode);
    }

	private Country extracted() {
		return country;
	}
    
    public List<String> getTravelMode() {
        return this.extracted().getTravelModes();
    }

	public String toString(){
        return "Id: " + this.id + ", Country: " + this.extracted().getCountryName() + ", Travel Mode: " + this.extracted().travelModesToString();
    }
}
