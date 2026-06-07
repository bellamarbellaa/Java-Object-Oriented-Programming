public class CargoPlane extends Airplane {
    private double cargoWeight;

    public CargoPlane(String model, int capacity, double cargoWeight) {
        super(model, capacity);
        this.cargoWeight = cargoWeight;
    }

    // Accessor
    public double getCargoWeight() {
        return cargoWeight;
    }

    // Mutator
    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    // Methods
    public void loadCargo() {
        System.out.println("Cargo loaded: " + cargoWeight + " tons.");
    }

    public void unloadCargo() {
        System.out.println("Cargo unloaded.");
    }
}