

import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Voyage here.
 *
 * @author (KAYROUZ Marina et AYACHE Zahra)
 * @version (2 NOV 2022)
 */

public class Client
{
    // instance variables - replace the example below with your own
    private static int id;
    private String name;
    private List<Voyage> voyage;

    /**
     * Constructor for objects of class Client
     */
    public Client(String name) {
        // initialize instance variables
        this.id ++;
        this.name = name;
        this.voyage = new ArrayList<Voyage>();
    }
    
    public List<Voyage> getTravel() {
		return voyage;
	}
   
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    public Voyage createTravel(String travelMode, String country) {
    	if (travelMode == null | country == null) {
    		throw new NullPointerException();
    	}
    	Voyage t = new Voyage(country);
        t.setTravelMode(travelMode);
        this.voyage.add(t);
        return t;
    }
}


