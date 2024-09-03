
package flightreservationapp_q2_st10083358;

public class Flight {     //This is the Parent Class which makes use of inheritance with the bookableFlight class (child class).
    private final String flightNumber;
    private final String destinationFrom;
    private final String destinationTo;
    private final double basePrice;

    // Constructors of the flight class for the flight details
    
    public Flight(String flightNumber, String destinationFrom, String destinationTo, double basePrice) {
        this.flightNumber = flightNumber;
        this.destinationFrom = destinationFrom;
        this.destinationTo = destinationTo;
        this.basePrice = basePrice;
    }

    // Getter methods which provide access to the private fields, allowing the safe retrieval of the values of flight details.
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestinationFrom() {
        return destinationFrom;
    }

    public String getDestinationTo() {
        return destinationTo;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Method used to display the flight details of the user , this including the flight number, From destination, To destination and the base price of the flight.
    
    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("From: " + destinationFrom);
        System.out.println("To: " + destinationTo);
        System.out.println("Base Price: R" + basePrice);
    }
}

