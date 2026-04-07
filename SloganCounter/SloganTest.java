package SloganCounter;

public class SloganTest {
    public static void main(String[] args) {
        // Declare the objects
        Slogan obj1;
        Slogan obj2;
        Slogan obj3;
        Slogan obj4;


        // Instantiate the objects with different phrases
        obj1 = new Slogan("Actions speak louder than words.");
        obj2 = new Slogan("Knowledge is power.");
        obj3 = new Slogan("Innovation distinguishes leaders.");
        obj4 = new Slogan("Stay hungry, stay foolish.");


        // Print the phrases using the objects
        System.out.println("Slogan 1: " + obj1.getPhrase());
        System.out.println("Slogan 2: " + obj2.getPhrase());
        System.out.println("Slogan 3: " + obj3.getPhrase());
        System.out.println("Slogan 4: " + obj4.getPhrase());


        // Print the total number of objects created using the static method
        System.out.println("\nTotal slogans created: " + Slogan.getCount());
    }
}
