package CarRelationships;

public class Mechanic {
    private String name;

    public Mechanic(String n) {
        name = n;
    }

    public void repair(String carModel) {
        System.out.println("Mechanic " + name + " is repairing " + carModel + ".");
    }
}
