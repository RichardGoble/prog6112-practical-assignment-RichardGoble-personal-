
package flightreservationapp_q2_st10083358;

class bookableFlight extends Flight {   //This is the child class that correlates directly to the parent class named as the flight class.
    
    //A tax rate of 10% is added to the base cost price of each flight to cover the booking fee and any other taxes on the flight
    private static final double TAX_RATE = 0.10; 

    public bookableFlight(String flightNumber, String destinationFrom, String destinationTo, double basePrice) {
        super(flightNumber, destinationFrom, destinationTo, basePrice);
    }

    // The method used to calculate the total price of the flight with tax included
    public double calculateTotalPrice() {
        return getBasePrice() * (1 + TAX_RATE);
    }

    // This is the method to display the full flight details.
    
    public void displayFlightDetailsWithTax() {
        super.displayFlightDetails();
        System.out.println("Total Price (including tax): R" + String.format("%.2f", calculateTotalPrice()));
    }
}
