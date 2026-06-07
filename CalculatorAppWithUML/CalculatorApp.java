import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to The Java Calculator App");

        boolean running = true;

        while (running) {

            try {
                System.out.println("\nAvailable: +, -, *, /, ^, %, s (sqrt), l (log), ! (fact), sin, cos, tan");

                System.out.print("Enter first number: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input!");
                    scanner.next();
                    continue;
                }
                double num1 = scanner.nextDouble();

                System.out.print("Enter operator: ");
                String op = scanner.next().toLowerCase();

                double result;

                switch (op) {

                    // Unary operations
                    case "s":
                        result = calculator.squareRoot(num1);
                        break;

                    case "l":
                        result = calculator.log10(num1);
                        break;

                    case "!":
                        if (num1 % 1 != 0) {
                            throw new ArithmeticException("Factorial only for integers");
                        }
                        result = calculator.factorial((int) num1);
                        break;

                    case "sin":
                        result = calculator.sine(num1);
                        break;

                    case "cos":
                        result = calculator.cosine(num1);
                        break;

                    case "tan":
                        result = calculator.tangent(num1);
                        break;

                    // Binary operations
                    default:
                        System.out.print("Enter second number: ");
                        if (!scanner.hasNextDouble()) {
                            System.out.println("Invalid input!");
                            scanner.next();
                            continue;
                        }
                        double num2 = scanner.nextDouble();

                        switch (op) {
                            case "+": result = calculator.add(num1, num2); break;
                            case "-": result = calculator.subtract(num1, num2); break;
                            case "*": result = calculator.multiply(num1, num2); break;
                            case "/": result = calculator.divide(num1, num2); break;
                            case "%": result = calculator.modulo(num1, num2); break;
                            case "^": result = calculator.power(num1, num2); break;
                            default:
                                System.out.println("Invalid operator!");
                                continue;
                        }
                }

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Continue? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                running = false;
            }
        }

        System.out.println("Goodbye!");
    }
}