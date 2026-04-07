package CarRelationships;


public class Car {
    private String model;
    private Engine carEngine;
     //The aggregated object carEngine is an attribute (Instance Variable) of the Car class.


    public Car(String m, Engine e) {
        model = m;
        carEngine = e;
    }


    public void startCar() {
        System.out.println("Starting the " + model + " car");
        carEngine.ignite(); //using the aggregated object (carEngine)'s method
    }


    public void stopCar() {
        System.out.println("Car " + model + " has stopped. ");
        carEngine.stop();
    }


    public void service(Mechanic tech) {
        System.out.println("Initiating service for " + model);
        tech.repair(model);
        /// The Mechanic is a dependency object passed into the service method of the Car class.
        // The Car uses the Mechanic temporarily to perform the repair (dependency)
        // while the Engine remains the aggregated component (aggregation).
    }
}
