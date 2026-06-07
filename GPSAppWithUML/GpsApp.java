import java.util.Scanner;

public class GpsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create GpsSystem object (Aggregation relationship)
        GpsSystem gps = new GpsSystem();

        System.out.println("--- GPS Navigation System ---");
        
        System.out.print("Enter Current X, Y: ");
        double curX = scanner.nextDouble();
        double curY = scanner.nextDouble();

        System.out.print("Enter Destination X, Y: ");
        double destX = scanner.nextDouble();
        double destY = scanner.nextDouble();

        // Perform calculations using decomposed methods
        double distance = gps.calculateDistance(curX, curY, destX, destY);
        double bearing = gps.calculateBearing(curX, curY, destX, destY);
        String direction = gps.getDirection(bearing);
        
        // Output Results
        System.out.println("\nRoute Calculated:");
        System.out.println("Distance: " + String.format("%.2f", distance) + " units");
        System.out.println("Heading: " + String.format("%.2f", bearing) + "° (" + direction + ")");
        
        System.out.print("\nEnter your average speed: ");
        double speed = scanner.nextDouble();
        double eta = gps.calculateEta(distance, speed);
        
        System.out.println("Estimated travel time: " + String.format("%.2f", eta) + " hours");

    }
}