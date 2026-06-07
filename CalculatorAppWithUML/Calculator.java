public class Calculator {

    // Basic Operations
    public double add(double x, double y) { return x + y; }
    public double subtract(double x, double y) { return x - y; }
    public double multiply(double x, double y) { return x * y; }

    public double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return x / y;
    }

    public double modulo(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Modulo by zero");
        }
        return x % y;
    }

    // Advanced Operations
    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    public double squareRoot(double x) {
        if (x < 0) {
            throw new ArithmeticException("Square root of negative number");
        }
        return Math.sqrt(x);
    }

    public double log10(double x) {
        if (x <= 0) {
            throw new ArithmeticException("Logarithm of non-positive number");
        }
        return Math.log10(x);
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("Factorial of negative number");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Trigonometry (degrees → radians)
    public double sine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public double cosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public double tangent(double degrees) {
        // safer check using cosine
        if (Math.abs(Math.cos(Math.toRadians(degrees))) < 1e-10) {
            throw new ArithmeticException("Tangent is undefined for this angle");
        }
        return Math.tan(Math.toRadians(degrees));
    }
}