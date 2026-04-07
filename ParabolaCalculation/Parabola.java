package ParabolaCalculation;

public class Parabola {
    // Encapsulation: private variables
    private double a;
    private double h;
    private double k;


    // Constructor
    public Parabola(double aVal, double hVal, double kVal) {
        a = aVal;
        h = hVal;
        k = kVal;
    }


    // Getters for the main method to print the equation
    public double getA() { return a; }
    public double getH() { return h; }
    public double getK() { return k; }


    // Specific methods
    public void showVertex() {
        System.out.println("Vertex         : (" + h + ", " + k + ")");
    }


    public void showLatusRectum() {
        double lr = 1 / a;
        System.out.println("Latus Rectum   : " + lr);
    }


    public void showFocus() {
        double focusX = h + (1 / (4 * a));
        System.out.println("Focus          : (" + focusX + ", " + k + ")");
    }


    public void showDirectrix() {
        double directrixX = h - (1 / (4 * a));
        System.out.println("Directrix      : x = " + directrixX);
    }
}
