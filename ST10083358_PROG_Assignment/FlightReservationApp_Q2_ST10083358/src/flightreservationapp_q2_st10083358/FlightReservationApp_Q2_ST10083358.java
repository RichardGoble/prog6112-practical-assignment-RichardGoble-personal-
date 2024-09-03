
package flightreservationapp_q2_st10083358;

import java.util.Scanner;

public class FlightReservationApp_Q2_ST10083358 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Array to store the available flights for the day with relevant flight details including the flight number, from destination and to destination and the relevant pricing of the flight.
        
        bookableFlight[] flights = new bookableFlight[8];
        flights[0] = new bookableFlight("FL123", "Durban (King Shaka Int Airport)", "Johannesburg (OR Tambo Int Airport)", 1500.00);
        flights[1] = new bookableFlight("FL456", "Cape Town (CT Int Airport)", "Durban (King Shaka Int Airport)", 2000.00);
        flights[2] = new bookableFlight("FL789", "Johannesburg (OR Tambo Int Airport)", "Cape Town (CT Int Airport)", 1200.00);
        flights[3] = new bookableFlight("FL101", "Johannesburg (Lanseria Airport)", "Bloemfontein (Bram Fischer Int Airport)", 1300.00);
        flights[4] = new bookableFlight("FL112", "Bloemfontein (Bram Fischer Int Airport)", "Port Elizabeth (PE Airport)", 2500.00);
        flights[5] = new bookableFlight("FL131", "Port Elizabeth (PE Airport)", "George (George Airport)", 2600.00);
        flights[6] = new bookableFlight("FL415", "George (George Airport)", "Pietermaritzburg (Oribi Airport)", 2400.00);
        flights[7] = new bookableFlight("FL161", "Pietermaritzburg (Oribi Airport)", "Durban (King Shaka Int Airport)", 2700.00);

        //While loop containing the different options and the relevant information to each option.
        
        while (true) {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Display Available Flights");
            System.out.println("2. Book a Flight");
            System.out.println("3. Exit");

            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Flights:");   //Option 1 is selected which then shows all available flights.
                    for (bookableFlight flight : flights) {
                        flight.displayFlightDetailsWithTax();
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Enter Flight Number to Book: ");  //Option 2 is selected by the user which then asks the user for the flight number of the flight being booked for.
                    String flightNumber = scanner.next();

                    bookableFlight selectedFlight = null;
                    for (bookableFlight flight : flights) {
                        if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                            selectedFlight = flight;
                            break;
                        }
                    }

                    if (selectedFlight == null) {
                        System.out.println("Flight not found.");
                    } else {
                        System.out.println("Enter 1 for One-way or 2 for Round-trip: ");  //Once the flight is selected , the user is asked to enter whether they want a one- way or Round-trip flight.
                        int tripType = scanner.nextInt();

                        double finalPrice = selectedFlight.calculateTotalPrice();
                        if (tripType == 2) {
                            finalPrice *= 2; // Calculation that doubles the price for when a user selects a round-trip flight.
                        }
                        
                        //User details are asked for after the flight type is chosen and before the flight booking is confirmend , this includes the users ID number, Name, and Email address.
                        
                        System.out.println("Enter your ID Number: ");
                        String idNumber = scanner.next();
                        System.out.println("Enter your Name: ");
                        String name = scanner.next();
                        System.out.println("Enter your Email Address: ");
                        String email = scanner.next();

                        
                        System.out.println("\nBooking Confirmed!");            //The booking is confirmed once the user details are captured.
                        
                        //The user detials and flight details are displayed for the user, once the booking has been confirmed.
                        
                        System.out.println("------------------------------------------------------------------");
                        System.out.println("\n------- Passenger Details --------------------------------------");
                        System.out.println("ID Number: " + idNumber);
                        System.out.println("Name: " + name);
                        System.out.println("Email: " + email);
                        System.out.println("\n------- Flight Details ------------------------------------------");
                        selectedFlight.displayFlightDetailsWithTax();
                        System.out.println("Total Price (including tax): R" + String.format("%.2f", finalPrice));
                        System.out.println("\n------------------------------------------------------------------");
                    }
                    break;
                    
                    // Option is chosen and the program is excited.
                    
                case 3:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");  // If an invalid choice is made the user is told to please try again.
            }
        }
    }
}


//Referencing List

// Educative.(2023). Java Inheritance Tutorial: explained with examples. n.d.[Online] Available at: https://www.educative.io/blog/java-inheritance-tutorial [Accessed: 25 August 2024].

// GeeksforGeeks.(2024). Iterating over ArrayLists in Java. n.d. [Online] Available at: https://www.geeksforgeeks.org/iterating-arraylists-java/ [Accessed 25 August 2024].

// OpenAI.(2024). ChatGPT. n.d.[Online] Available at: https://www.openai.com/chatgpt [Accessed: 1 September 2024].

// Microsoft.(2024). Copilot AI. n.d.[Online] Available at: https://www.microsoft.com/copilot [Accessed: 1 September 2024].

// Class mates were also a great help.