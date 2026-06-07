public class AirplaneMain {
    public static void main(String[] args) {

        PassengerPlane p1 = new PassengerPlane("Boeing 737", 180, 150, 70.5);
        CargoPlane c1 = new CargoPlane("Airbus A330", 2, 80.0);

        p1.fly();
        p1.boardPassengers();
        p1.serveSnacks();
        System.out.println("Total passenger weight: " + p1.getTotalPassengerWeight());

        c1.fly();
        c1.loadCargo();
        c1.unloadCargo();
    }
}