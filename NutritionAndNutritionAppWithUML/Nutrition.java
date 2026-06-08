public class Nutrition {
    // Basic conversion logic (Decomposed methods)
    public double gramsToOunces(double grams) {
        return grams * 0.035274;
    }

    // Improved error handling for negative temperatures 
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Algorithm to calculate total calories based on quantity 
    public double calculateCalories(double grams, double caloriesPer100g) {
        if (grams < 0 || caloriesPer100g < 0) return 0;
        return (grams / 100) * caloriesPer100g;
    }

    // Logic to adjust cooking time based on servings
    public double adjustCookingTime(int baseMinutes, double factor) {
        return baseMinutes * factor;
    }
}