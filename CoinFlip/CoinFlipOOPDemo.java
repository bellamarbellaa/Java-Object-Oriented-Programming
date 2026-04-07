package CoinFlip;

public class CoinFlipOOPDemo {
    public static void main(String[] args) {
        // Total number of flips
        final int FLIPS = 100;
        int heads = 0;
        int tails = 0;


        // Creating the object of CoinFlipComplete
        // Ensure you have the separate CoinFlipComplete.java file in your project!
        CoinFlipOOP myCoin = new CoinFlipOOP();


        System.out.println("Flipping the coin " + FLIPS + " times...\n");
       
        // Loop to simulate flipping a coin 100 times
        for (int count = 1; count <= FLIPS; count++) {
            // Invoke the mutator service
            myCoin.flip();


           
            // Conditional statement
            if (myCoin.isHead()) {
                System.out.println("Flip " + count + ": Heads");
                heads++;
            } else {
                System.out.println("Flip " + count + ": Tails");
                tails++;
            }
        }


        // Display the amount of heads and tails returned
        System.out.println("Number of flips: " + FLIPS);
        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
    } // End of main method
} 