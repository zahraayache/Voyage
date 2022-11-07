package TravelImplementation;


import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class Country
{
	private String countryName;
	private List <String> travelModes;
	
    /**
     * Constructor for objects of class Country
     */
    public Country() {
    	this.travelModes = new ArrayList<String>() ; 
    }
    
    public Country(String countryName) {
    	this.travelModes = new ArrayList<String>() ; 
    	this.countryName = countryName;
    }

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<String> getTravelModes() {
		return this.travelModes;
	}

	public List<String> addTravelModes(String travelMode) {
		if (travelMode == null) {
    		throw new NullPointerException();
    	}
		String mode ="";
        switch (travelMode.toUpperCase()){
            case "CAR":
            	mode = "Car";
                break;
            case "AIRPLANE":
            	mode = "Airplane";
            	break;
            default:
            	mode = "Bus";
            	break;
        }
        if (!(this.travelModes.contains(mode))){
        	this.travelModes.add(mode);
        }
        return this.travelModes;
    }
	
	public void removeTravelModes() {
		 this.travelModes.clear();
		
	}
    
    public String travelModesToString() {
    	 String modes ="";
         for (String m: this.travelModes) {
         	modes += m +" ";
         }
         return modes;
    }
}