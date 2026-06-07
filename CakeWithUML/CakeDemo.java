import java.util.Scanner;

public class CakeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Aggregation relationship between CakeDemo and Cake classes.  The CakeDemo class uses the Cake class 
        // by creating an instance of it and using its methods to perform calculations, so the Cake class is a part of the CakeDemo class. 
        Cake myCake = new Cake();

        System.out.println("Welcome to Cake Baking Simulator!");
        System.out.println("1. Sponge Cake | 2. Cheesecake | 3. Chocolate Cake");
        System.out.print("Select (1-3): ");
        int choice = scanner.nextInt();

        String type = (choice == 1) ? "Sponge" : (choice == 2) ? "Cheesecake" : "Chocolate";

        // Execute step-by-step algorithm to prepare the cake based on user selection
        System.out.println("\n--- Preparation: " + type + " ---");
        System.out.println("Ingredients: " + myCake.gatherIngredients(type));
        
        myCake.prepareIngredients();
        myCake.mixWet();
        myCake.mixDry();

        // Determining baking method by type 
        if (type.equals("Cheesecake")) {
            myCake.bake(60, "Water Bath"); 
        } else {
            int time = (type.equals("Sponge")) ? 25 : 35;
            myCake.bake(time);
        }

        myCake.decorate(type);
    
    }
}