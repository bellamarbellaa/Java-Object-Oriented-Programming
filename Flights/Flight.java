package Flights;

class Flight {
    //Attributes, contained instance data, which are made private
    private String airlineName;
    private int flightNumber;
    private String origin;
    private String destination;

    //Constructor, used to initialize the attributes for each flight object
    public Flight(String name, int num, String ori, String dest) {
        airlineName = name;
        flightNumber = num;
        origin = ori;
        destination = dest;
    }

    //Getter and Setter methods (total 10) for all instance data
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String name) {
        airlineName = name;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int num) {
        flightNumber = num;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String ori) {
        origin = ori;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String dest) {
        destination = dest;
    }

    public void displayFlightInfo() {
        System.out.println("Airline: " + airlineName);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Route Origin: " + origin);
        System.out.println("Route Destination: " + destination);
        System.out.println("---------------------------");
    }

}