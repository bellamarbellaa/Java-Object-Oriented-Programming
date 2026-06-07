public class Cake {
    // Returns ingredient list based on cake type (Reusability)
    public String gatherIngredients(String type) {
        if (type.equals("Sponge")) return "Eggs, Butter, Sugar, Flour, Vanilla";
        if (type.equals("Cheesecake")) return "Cream Cheese, Biscuits, Sugar, Eggs";
        return "Flour, Cocoa Powder, Milk, Eggs, Sugar"; // Default: Chocolate
    }

    public void prepareIngredients() {
        System.out.println("Step 1: Weigh and prepare all ingredients on the counter.");
    }

    // Decomposed method for wet ingredients
    public void mixWet() {
        System.out.println("Step 2: Beat wet ingredients (butter, eggs, sugar) until fluffy.");
    }

    // Decomposed method for dry ingredients
    public void mixDry() {
        System.out.println("Step 3: Gradually fold dry ingredients into the wet mixture.");
    }

    // Same method name needs unique definiton (Method Overloading)
    public void bake(int minutes) {
        System.out.println("Step 4: Bake in the oven for " + minutes + " minutes.");
    }

    public void bake(int minutes, String method) {
        System.out.println("Step 4: Bake for " + minutes + " minutes using the " + method + " technique.");
    }

    // Topping logic based on cake type (Control Structures)
    public void decorate(String type) {
        String topping;
        if (type.equals("Sponge")) {
            topping = "Powdered Sugar";
        } else if (type.equals("Cheesecake")) {
            topping = "Strawberry Glaze";
        } else {
            topping = "Almond";
        }
        
        System.out.println("Step 5: Decorate with " + topping + ".");
        System.out.println("--- Congratulations! Your cake is finished ---");
    }
}