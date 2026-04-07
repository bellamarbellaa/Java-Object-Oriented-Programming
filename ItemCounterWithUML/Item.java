package ItemCounterWithUML;

public class Item {
    // Static variable to track the count across ALL objects
    private static int count = 0;
    public Item() {
        count++;
    }
    // Constructor to increment the static count every time a new object is made
    public static int getCount() {
        return count;
    }

    // Static method to return the current count
    public static int getItemCount() {
        return count;
    }
}
