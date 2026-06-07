public class Bookshelf{
     public static void main(String[] args) {
        // 1. Initial Instantiation
        Book b1 = new Book("Atomic Habits", "James Clear", "Avery", 2018);
        Book b2 = new Book("Red Queen", "Victoria Aveyard", "HarperTeen", 2015);
        Book b3 = new Book("Harry Potter (1st edition)", "J.K. Rowling", "Bloomsbury", 1997);

        System.out.println("\n--- Original Records ---");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // 2. Updating records
        System.out.println("\nUpdating some records...");
        b3.setTitle("Harry Potter and the Deathly Hallows");
        b3.setCopyrightDate(2007); 

        b1.setCopyrightDate(2022); 
        b2.setPublisher("Orion Publishing"); 

        // 3. Final Display to view all changes
        System.out.println("\n--- Updated Bookshelf ---");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}