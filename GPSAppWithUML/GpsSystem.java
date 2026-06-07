public class GpsSystem {
    
    // Calculates the Euclidean distance between two points
    public double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Determines the Estimated Time of Arrival (ETA) [cite: 3]
    public double calculateEta(double distance, double averageSpeed) {
        if (averageSpeed <= 0) {
            return 0; // Avoid division by zero 
        }
        return distance / averageSpeed;
    }

    // Determines the compass bearing using trigonometry
    public double calculateBearing(double x1, double y1, double x2, double y2) {
        double angle = Math.toDegrees(Math.atan2(y2 - y1, x2 - x1));
        return (angle + 360) % 360; // Normalize to 0-360 degrees
    }

    // Provides a text-based direction algorithm
    public String getDirection(double bearing) {
        if (bearing >= 337.5 || bearing < 22.5) return "North";
        if (bearing >= 22.5 && bearing < 67.5) return "North-East";
        if (bearing >= 67.5 && bearing < 112.5) return "East";
        if (bearing >= 112.5 && bearing < 157.5) return "South-East";
        if (bearing >= 157.5 && bearing < 202.5) return "South";
        if (bearing >= 202.5 && bearing < 247.5) return "South-West";
        if (bearing >= 247.5 && bearing < 292.5) return "West";
        return "North-West";
    }
}