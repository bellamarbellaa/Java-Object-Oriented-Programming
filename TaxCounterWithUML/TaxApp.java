import java.util.Scanner;

public class TaxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Printing the tax rules before input
        System.out.println("=== WELCOME TO THE INDONESIAN TAX CALCULATION APP ===");
        System.out.println("1. Basic Non-Taxable Income (PTKP): Rp 54.000.000");
        System.out.println("2. Dependent Allowance: Rp 4.500.000 per person (Max 3)");
        System.out.println("3. Tax Brackets: 5% (0-60jt), 15% (60-250jt), 25% (250-500jt), 30% (>500jt)");
        System.out.println("===================================\n");

        // User 1 Input
        System.out.println("[User 1 Setup]");
        System.out.print("Enter Annual Income (Rupiah): ");
        double inc1 = scanner.nextDouble();
        System.out.print("Number of Dependents: ");
        int dep1 = scanner.nextInt();

        // User 2 Input
        System.out.println("\n[User 2 Setup]");
        System.out.print("Enter Annual Income (Rupiah): ");
        double inc2 = scanner.nextDouble();
        System.out.print("Number of Dependents: ");
        int dep2 = scanner.nextInt();

        // Aggregation relationship: TaxApp uses Tax class by creating instances of it.
        Tax user1 = new Tax(inc1, dep1);
        Tax user2 = new Tax(inc2, dep2);

        // Process User 1
        double pkp1 = user1.calculatePKP();
        System.out.println("\n--- User 1 Result ---");
        System.out.println("Taxable Income (PKP): Rp " + pkp1);
        System.out.println("Total Tax Due: Rp " + user1.calculateTaxAmount(pkp1));

        // Process User 2
        double pkp2 = user2.calculatePKP();
        System.out.println("\n--- User 2 Result ---");
        System.out.println("Taxable Income (PKP): Rp " + pkp2);
        System.out.println("Total Tax Due: Rp " + user2.calculateTaxAmount(pkp2));

        scanner.close();
    }
}