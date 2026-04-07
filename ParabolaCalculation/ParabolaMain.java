package ParabolaCalculation;

import java.util.Scanner;


public class ParabolaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Parabola Values: ");
        System.out.print("Value of a: ");
        double a = input.nextDouble();
        System.out.print("Value of k: ");
        double k = input.nextDouble();
        System.out.print("Value of h: ");
        double h = input.nextDouble();


        // Object instantiation
        Parabola p = new Parabola(a, h, k);


        // Printing the equation first according to the input data
        System.out.println("\nEquation: x = " + p.getA() + "(y - " + p.getK() + ")^2 + " + p.getH());


        // Calling specific methods for output
        p.showVertex();
        p.showLatusRectum();
        p.showFocus();
        p.showDirectrix();
    }
}


