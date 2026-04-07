package CarDependencyRelationship;

public class CarDependency {
     void drive(EngineDependency engine) {
        // Invokes the start method from EngineDependency (temporary use)
        engine.start();
        System.out.println("Car is moving...");
     }

     public static void main(String[] args) {
        EngineDependency engine = new EngineDependency();
        CarDependency car = new CarDependency();

        // Dependency: Engine object is passed as a method parameter
        // and used temporarily (not stored in the class)
        car.drive(engine);
     }
}

