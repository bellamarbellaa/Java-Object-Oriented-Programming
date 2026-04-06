import java.util.Scanner;


public class GravityCalculator {
    public static void main(String[] argrs) {
        Scanner scan = new Scanner(System.in);
        double m1, m2, distance, force;


        //Define the gravitational constant
        final double G = 6.67430 * Math.pow(10, -11);


        //Get user input for mass
        System.out.print("Enter mass of m1 (kg): ");
        m1 = scan.nextDouble();


        System.out.print("Enter mass of m2 (kg): ");
        m2 = scan.nextDouble();


        System.out.print("Enter the distance between the centers of two objects in meters:");
        distance = scan.nextDouble();


        force = G * m1 * m2 / (distance * distance);
        System.out.println("The gravitational force between the two objects is: " + force + " N");
    }
}
