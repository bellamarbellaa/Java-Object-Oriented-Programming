package DrivingCar;

public class CarDrive {
    // 1. Instance Variables
    private String model;
    private int year;
    private double fuelLevel;
    private boolean isRunning;


    // 2. Static Variable (Shared by all instances)
    private static int totalCarsCreated = 0;


    // 3. Constructor
    public CarDrive(String m, int y, double f) {
        model = m;
        year = y;
        fuelLevel = f;
        isRunning = false;
        totalCarsCreated++;
    }


    // 4. Instance Methods (Behaviors)
    public void startEngine() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println(model + " engine started. Fuel: " + (fuelLevel * 100) + "%");
        } else {
            System.out.println("Alert: " + model + " has an empty tank!");
        }
    }


    public void drive() {
        if (isRunning) {
            System.out.println("The " + model + " (" + year + ") is now driving...");
            fuelLevel -= 0.1;
        } else {
            System.out.println("Action failed: Start the engine first.");
        }
    }


    // 5. Static Getter
    public static int getTotalCarsCreated() {
        return totalCarsCreated;
    }


    // 6. Regular Getters to see the state
    public String getModel() { return model; }
    public double getFuelLevel() { return fuelLevel; }
}

