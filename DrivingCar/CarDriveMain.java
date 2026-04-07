package DrivingCar;

public class CarDriveMain {
    public static void main(String[] args) {
        // Step 1: Check initial class-level data
        System.out.println("Total cars in system: " + CarDrive.getTotalCarsCreated());


        // Step 2: Instantiate CarDrive objects
        CarDrive car1 = new CarDrive("Tesla Model S", 2023, 0.5);
        CarDrive car2 = new CarDrive("Vintage Beetle", 1965, 0.0);


        // Step 3: Orchestration
        System.out.println("\n--- Operating Vehicle 1 ---");
        car1.startEngine();
        car1.drive();
        System.out.println("Remaining fuel for " + car1.getModel() + ": " + car1.getFuelLevel());


        System.out.println("\n--- Operating Vehicle 2 ---");
        car2.startEngine(); // This will fail due to 0.0 fuel
        car2.drive();


        // Step 4: Final report
        System.out.println("\nFinal count of cars created: " + CarDrive.getTotalCarsCreated());
    }
}

