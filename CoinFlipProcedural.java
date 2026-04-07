import java.util.Random;


class CoinFlipProcedural {
    // Instance variables (encapsulation)
    // Private instance variable for the face of the coin
    private int face;
    // Constants to represent heads and tails
    private static final int HEAD = 0;
    private static final int TAIL = 1;
   
    //Constructor to initialise the coin when created
    public CoinFlipProcedural() {
    //Automatically flips the coin when object is created
    //to set the face value
        flip();
    }
   
    // Mutator method that simulates the coin flip
    public void flip() {
        Random rand = new Random();
        // Generates a random integer: 0 or 1
        face = rand.nextInt(2);
    }

    // Accessor method that determines whether the current face is heads
    public boolean isHead() {
        return face == HEAD;
    }


    public static void main(String[] args) {
       //This calls the constructor
        CoinFlipProcedural myCoin = new CoinFlipProcedural();
       
       //Invoke the mutator to flip the coin
       myCoin.flip();


     // Output the result (true for Heads, false for Tails)
        System.out.println("Is it Heads? " + myCoin.isHead());
    }
}
