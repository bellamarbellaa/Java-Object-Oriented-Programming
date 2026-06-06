public class Kennel {
    public static void main(String[] args) {

        // Original Dog Objects
        Dog dog1 = new Dog("Strawberry Shortcake", 3);
        Dog dog2 = new Dog("Blueberry Muffin", 5);
        Dog dog3 = new Dog("Apple Dumplin", 2);

        System.out.println("--- Original Kennel Records ---");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        // Updating records
        System.out.println("\nUpdating dog records...");

        dog1.setAge(4);  // increased from 3 to 4
        dog2.setAge(6);  // increased from 5 to 6
        dog3.setAge(3);  // increased from 2 to 3

        // Display updated records
        System.out.println("\n--- Updated Kennel Records ---");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}