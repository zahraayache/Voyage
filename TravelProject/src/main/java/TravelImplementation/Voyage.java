package TravelImplementation;


import java.util.List;

/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class Voyage 
{
    private static int referenceNumber = 0;
	private Country country;
    private double price; 

	/**
     * Constructor for objects of class Travel
     */
    
    public Voyage() {
        Voyage.referenceNumber++; 
    	this.country = new Country();
    }

    public Voyage(String country) {
        Voyage.referenceNumber++;
        this.country = new Country();
        this.extracted().setCountryName(country);
    }
    
    public int getNumeroDeReference() {
        return Voyage.referenceNumber;
    }
    
    public void setNumeroDeReference(int numeroDeReference) {
		Voyage.referenceNumber = numeroDeReference;
	}
    
    public Country getCountry() {
        return this.extracted();
    }
    
    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
        return "Id: " + Voyage.referenceNumber + ", Country: " + this.extracted().getCountryName() + ", Travel Mode: " + this.extracted().travelModesToString();
    }
}
