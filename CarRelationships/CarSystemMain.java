package CarRelationships;

public class CarSystemMain {
    public static void main(String[] args) {
        // myCar has an Engine (aggregation relationship), myEngine is
        // the aggregated object that is stored as an attribute of myCar.
        Engine myEngine = new Engine("V8 Turbo", 450);
        Car myCar = new Car("Mustang", myEngine); //


        // myCar uses Bob as the independent object temporarily (dependency), 
        // but Bob is not a permanent part of myCar's state 
        Mechanic guy = new Mechanic("Bob");


        // Execute methods to demonstrate aggregation (Car-Engine) and dependency (Car-Mechanic)
        System.out.println("--- Aggregation in Action ---");
        myCar.startCar();
        myCar.stopCar();


        System.out.println("\n--- Dependency in Action ---");
        myCar.service(guy); // myCar uses Bob as the independent object temporarily
    }
}

