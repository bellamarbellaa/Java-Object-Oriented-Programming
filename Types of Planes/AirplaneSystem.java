import java.util.Scanner;

// Helper class for Passenger logic
class PassengerPlane {
    private int passengers;
    private double averageWeight;

    public PassengerPlane(int passengers, double avgWeight) {
        this.passengers = passengers;
        this.averageWeight = avgWeight;
    }

    public void boardPassengers() {
        System.out.println(passengers + " passengers have boarded.");
    }

    public void serveSnacks() {
        System.out.println("Snacks are currently being served.");
    }

    public double getTotalWeight() {
        return passengers * averageWeight;
    }
}

// Helper class for Cargo logic
class CargoPlane {
    private double cargoWeight;

    public CargoPlane(double weight) {
        this.cargoWeight = weight;
    }

    public void loadCargo() {
        System.out.println("Loading cargo into the hold...");
    }

    public void deliveryStatus() {
        System.out.println("Status: Currently waiting for delivery.");
    }

    public double getTotalWeight() {
        return cargoWeight;
    }
}

class Airplane {
    private String model;
    private PassengerPlane pPlane; 
    private CargoPlane cPlane;     

    public Airplane(String model) {
        this.model = model;
    }

    public void setPassenger(PassengerPlane p) { this.pPlane = p; }
    public void setCargo(CargoPlane c) { this.cPlane = c; }

    public PassengerPlane getPassenger() { return pPlane; }
    public CargoPlane getCargo() { return cPlane; }

    // Instance method with dynamic binding, uses "model" of the specific Airplane instance at runtime
    public void fly() {
        System.out.println("\n" + model + " is now in flight.");
    }
}

public class AirplaneSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Airplane myPlane;

        System.out.println("Select Type: 1. Passenger (Boeing)  2. Cargo (Lockheed)");
        int choice = scan.nextInt();

        if (choice == 1) {
            myPlane = new Airplane("Boeing 747");
            System.out.print("Enter number of passengers: ");
            int count = scan.nextInt();
            myPlane.setPassenger(new PassengerPlane(count, 70.0));
            
            myPlane.fly();
            myPlane.getPassenger().boardPassengers();
            myPlane.getPassenger().serveSnacks();
            System.out.println("Total Weight: " + myPlane.getPassenger().getTotalWeight() + " kg");

        } else if (choice == 2) {
            myPlane = new Airplane("Lockheed C-5 Galaxy");
            System.out.print("Enter cargo weight (kg): ");
            double weight = scan.nextDouble();
            myPlane.setCargo(new CargoPlane(weight));
            
            myPlane.fly();
            myPlane.getCargo().loadCargo();
            myPlane.getCargo().deliveryStatus();
            System.out.println("Total Cargo Weight: " + myPlane.getCargo().getTotalWeight() + " kg");
        }

        scan.close();
    }
}