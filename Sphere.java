import java.util.Scanner;
import java.text.DecimalFormat;


class Sphere{
    private double diameter;
   


    // Constructor: Accepts and initializes the diameter
    public Sphere(double initialDiameter) {
        diameter = initialDiameter;
    }


    // Helper method to get radius from diameter
    public double getRadius() {
        return diameter / 2.0;
    }


    // Method to calculate Volume: V = 4/3 * PI * r^3
    public double calculateVolume() {
        double radius = getRadius();
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }


    // Method to calculate Surface Area: A = 4 * PI * r^2
    public double calculateSurfaceArea() {
        double radius = getRadius();
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.####");


        // 1. Get input
        System.out.print("Enter the sphere's diameter: ");
        double inputDiameter = scan.nextDouble();


        // 2. Create the object
        Sphere mySphere = new Sphere(inputDiameter);


        // 3. Show the radius (calculated via the object)
        System.out.println("Therefore the sphere's radius is: " + mySphere.getRadius());
       
        // 4. Retrieve and display calculations
        double volume = mySphere.calculateVolume();
        double surfaceArea = mySphere.calculateSurfaceArea();


        System.out.println("Volume = " + fmt.format(volume));
        System.out.println("Surface Area = " + fmt.format(surfaceArea));
    }
}
    
