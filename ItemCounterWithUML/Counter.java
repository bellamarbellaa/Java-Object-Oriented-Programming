package ItemCounterWithUML;

public class Counter {
    public static void main(String[] args) {
        // Create several instances of itemCounter object
        Item obj1 = new Item();
        Item  obj2 = new Item();
        Item obj3 = new Item();

        // Verify the count
        System.out.println("Total items created: " + Item.getItemCount());
        
        // Create one more itemCounter to test static counter
        Item obj4 = new Item();
        System.out.println("Updated total: " + Item.getItemCount());
    }
}
