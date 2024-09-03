
package flightreservationapp_q2_st10083358;

import static org.junit.Assert.*;
import org.junit.Test;

public class FlightTest {
    
    public FlightTest() {
    }

    @Test
    public void testFlightConstructor() { // This test , tests the flight class constructors to see if all the constructors are called and working
        
        String flightNumber = "FL123";
        String destinationFrom = "Durban (King Shaka Int Airport)";
        String destinationTo = "Johannesburg (OR Tambo Int Airport)";
        double basePrice = 1500.00;

        Flight flight = new Flight(flightNumber, destinationFrom, destinationTo, basePrice);

        assertEquals(flightNumber, flight.getFlightNumber());
        assertEquals(destinationFrom, flight.getDestinationFrom());
        assertEquals(destinationTo, flight.getDestinationTo());
        assertEquals(basePrice, flight.getBasePrice(), 0.01);
    }

    @Test
    public void testGetFlightNumber() { //This test , tests whether the flight number is received and correct to the one stored in the flight object when the user selects a flight.
        
        Flight flight = new Flight("FL123", "Durban (King Shaka Int Airport)", "Johannesburg (OR Tambo Int Airport)", 1500.00);
        String flightNumber = flight.getFlightNumber();
        
        assertEquals("FL123", flightNumber);   //Validates that the correct flight number is returned.
    }

    @Test
    public void testGetDestinationFrom() { //This test, tests to check that the getDestinationFrom method correctly returns the correct destination from stored in the flight object.
        
        Flight flight = new Flight("FL123", "Durban (King Shaka Int Airport)", "Johannesburg (OR Tambo Int Airport)", 1500.00);
        String destinationFrom = flight.getDestinationFrom();
        
        assertEquals("Durban (King Shaka Int Airport)", destinationFrom);   // Validates that the departure location matches the result.
    }

    @Test
    public void testGetDestinationTo() { //This test, tests to check that the getDestinationTo method correctly returns the correct destination to stored in the flight object.
   
        Flight flight = new Flight("FL123", "Durban (King Shaka Int Airport)", "Johannesburg (OR Tambo Int Airport)", 1500.00);
        String destinationTo = flight.getDestinationTo();

        assertEquals("Johannesburg (OR Tambo Int Airport)", destinationTo);  // Validates that the arrival location is correctly retrieved.
    }

    @Test
    public void testGetBasePrice() { //This test, tests to check the getBasePrice method to ensure that the correct base price set in the flight object for the specific flight is displayed when a user selects a flight.
 
        Flight flight = new Flight("FL123", "Durban (King Shaka Int Airport)", "Johannesburg (OR Tambo Int Airport)", 1500.00);
        double basePrice = flight.getBasePrice();

        assertEquals(1500.00, basePrice, 0.01);  // Check that the base price is correctly returned.
    }

    @Test
    public void testDisplayFlightDetails() {  //This test, tests to check the output of the displayFlightDetails method which should display all the flight detials in the console.
   
        Flight flight = new Flight("FL123", "Durban (King Shaka Int Airport)", "Johannesburg (OR Tambo Int Airport)", 1500.00);
        
        flight.displayFlightDetails();

    }
}
