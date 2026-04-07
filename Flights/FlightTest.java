package Flights;

public class FlightTest {
    public static void main(String[] args) {
        //Creating new flight objects using constructor
        Flight f1 = new Flight("Garuda Indonesia", 101, "Jakarta", "Bali");
        Flight f2 = new Flight("Cathay Pacific", 202, "Jakarta", "Bangkok");
        Flight f3 = new Flight("Qantas Airline", 303, "Jakarta", "Melbourne");


        //Initial Display
        System.out.println("\nCurrent flight info: ");
        f1.displayFlightInfo(); 
        f2.displayFlightInfo();
        f3.displayFlightInfo();

        //Updating flight data
        System.out.println("\nUpdating certain flight data. Please wait. ");
        f1.setDestination("Tokyo");
        f3.setOrigin("Bali");
        f2.setFlightNumber(205);

        //Display again to see the update
        System.out.println("\nCurrent flight info: ");
        f1.displayFlightInfo();
        f2.displayFlightInfo();
        f3.displayFlightInfo();
    }
}