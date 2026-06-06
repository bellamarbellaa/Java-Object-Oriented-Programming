public class Tax {
    // Private attributes for encapsulation
    private double annualIncome;
    private int dependents;

    // Constructor to initialize the tax profile
    public Tax(double income, int dependents) {
        this.annualIncome = income;
        this.dependents = (dependents > 3) ? 3 : dependents; // Max 3 dependents allowed
    }

    // Method to calculate PTKP (Non-Taxable Income)
    public double calculatePTKP() {
        double basicPTKP = 54000000; // Base for individual
        double perDependent = 4500000; // Additional per dependent
        return basicPTKP + (dependents * perDependent);
    }

    // Method to calculate Taxable Income (PKP)
    public double calculatePKP() {
        double ptkp = calculatePTKP();
        double pkp = annualIncome - ptkp;
        return (pkp < 0) ? 0 : pkp;
    }

    // Algorithm for progressive tax brackets
    public double calculateTaxAmount(double pkp) {
        if (pkp <= 60000000) return pkp * 0.05;
        if (pkp <= 250000000) return (60000000 * 0.05) + ((pkp - 60000000) * 0.15);
        if (pkp <= 500000000) return (60000000 * 0.05) + (190000000 * 0.15) + ((pkp - 250000000) * 0.25);
        return (60000000 * 0.05) + (190000000 * 0.15) + (250000000 * 0.25) + ((pkp - 500000000) * 0.30);
    }
}