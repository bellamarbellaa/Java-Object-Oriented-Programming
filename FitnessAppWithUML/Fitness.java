public class Fitness {
    // Private attributes to protect personal data
    private String userName;
    private double weight; // in kg
    private double height; // in meters

    // Constructor to initialize the user data
    public Fitness(String name, double w, double h) {
        this.userName = name;
        this.weight = w;
        this.height = h;
    }

    // Method to calculate BMI (Body Mass Index)
    public double calculateBMI() {
        return weight / (height * height);
    }

    // Method to classify weight status based on BMI
    public String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal weight";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    // Method to calculate calories burned during exercise
    public double calculateCaloriesBurned(int minutes, String intensity) {
        double met = (intensity.equals("High")) ? 8.0 : 4.0;
        return (met * 3.5 * weight / 200) * minutes;
    }

    public String getName() {
        return userName;
    }
}