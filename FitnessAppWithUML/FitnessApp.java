import java.util.Scanner;

public class FitnessApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the MyFitness App ---");
        
        // Data collection for User 1
        System.out.println("\n[User 1 Setup]");
        System.out.print("Enter name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter weight (kg): ");
        double w1 = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double h1 = scanner.nextDouble();
        scanner.nextLine(); // buffer cleanup after nextDouble()

        // Data collection for User 2
        System.out.println("\n[User 2 Setup]");
        System.out.print("Enter name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter weight (kg): ");
        double w2 = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double h2 = scanner.nextDouble();
        scanner.nextLine(); // buffer cleanup after nextDouble()

        // Aggregation relationship between FitnessApp and Fitness classes. The FitnessApp class uses the Fitness class 
        // by creating an instance of it and using its methods to perform calculations
        Fitness user1 = new Fitness(name1, w1, h1);
        Fitness user2 = new Fitness(name2, w2, h2);

        // Process and display User 1
        System.out.println("\n--- Report for " + user1.getName() + " ---");
        double bmi1 = user1.calculateBMI();
        System.out.println("BMI: " + String.format("%.2f", bmi1) + " (" + user1.getStatus(bmi1) + ")");

        // Process and display User 2
        System.out.println("\n--- Report for " + user2.getName() + " ---");
        double bmi2 = user2.calculateBMI();
        System.out.println("BMI: " + String.format("%.2f", bmi2) + " (" + user2.getStatus(bmi2) + ")");
    }
}