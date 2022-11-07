//package TravelImplementation;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
///**
// * Write a description of class Voyage here.
// *
// * @author (KAYROUZ Marina et AYACHE Zahra)
// * @version (2 NOV 2022)
// */
//
//public class ClientTest
//{
//    /**
//     * Default constructor for test class TravelTest
//     */
//	private static Client client;
//	
//    @BeforeAll
//    public static void setUp() {
//        client = new Client("Marina","France");
//    }
//    
//    @Test
//    public void testConstructor() {
//    	assertEquals("Marina", client.getName());
//    	assertEquals(1,client.getId());
//    }
//    
//    @Test
//    public void testCreateTravel() {
//    	client.createTravel("car", "France");
//    	client.createTravel("bus", "Italy");
//    	// We are chekcing it set the country name 
//    	assertEquals(client.getTravel().get(0).getCountry().getCountryName(),"France");
//    	assertEquals(client.getTravel().get(1).getCountry().getCountryName(),"Italy"); 
//    	// We are checking that it set the travel mode 
//    	assertEquals(client.getTravel().get(0).getTravelMode().get(0),"Car");
//    	assertEquals(client.getTravel().get(1).getTravelMode().get(0),"Bus");
//    	//We are checking null input 
//    	assertThrows(NullPointerException.class,
//	            ()->{
//	            	this.client.createTravel(null, "france");
//	            });
//    	assertThrows(NullPointerException.class,
//	            ()->{
//	            	this.client.createTravel("car", null);
//	            });
//    	
//    }
//}