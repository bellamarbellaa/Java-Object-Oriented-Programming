import java.util.Scanner;

public class NutritionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Aggregation: NutritionApp "has a" Nutrition object to utilize its methods
        Nutrition myNutrition = new Nutrition();

        System.out.println("--- Welcome to Nutrition Calculator ---");
        
        System.out.print("Enter ingredient weight (grams): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter calories per 100g: ");
        double calPer100 = scanner.nextDouble();

        // Calling decomposed methods for clarity 
        double totalCalories = myNutrition.calculateCalories(weight, calPer100);
        double weightInOz = myNutrition.gramsToOunces(weight);

        System.out.println("\n--- Nutritional Info ---");
        System.out.println("Weight: " + weightInOz + " oz");
        System.out.println("Total Calories: " + totalCalories + " kcal");

        System.out.print("\nEnter cooking temp (Celsius): ");
        double tempC = scanner.nextDouble();
        System.out.println("Set oven to: " + myNutrition.celsiusToFahrenheit(tempC) + "°F");
        
        System.out.print("\nEnter base cooking time (minutes): ");
        int baseTime = scanner.nextInt();
        System.out.println("Adjusted cooking time: " + myNutrition.adjustCookingTime(baseTime, 1.5) + " minutes");
    }
}