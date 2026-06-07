public class PassengerPlane extends Airplane {
    private int passengers;
    private double averagePassengerWeight;

    public PassengerPlane(String model, int capacity, int passengers, double avgWeight) {
        super(model, capacity);
        this.passengers = passengers;
        this.averagePassengerWeight = avgWeight;
    }

    // Accessors
    public int getPassengers() {
        return passengers;
    }

    public double getAveragePassengerWeight() {
        return averagePassengerWeight;
    }

    // Mutators
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setAveragePassengerWeight(double avgWeight) {
        this.averagePassengerWeight = avgWeight;
    }

    // Methods
    public void boardPassengers() {
        System.out.println(passengers + " passengers boarded.");
    }

    public void serveSnacks() {
        System.out.println("Snacks are being served.");
    }

    public double getTotalPassengerWeight() {
        return passengers * averagePassengerWeight;
    }
}