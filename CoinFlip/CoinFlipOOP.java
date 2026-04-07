package CoinFlip;

public class CoinFlipOOP {
    //public constants are allowed in encapsulation
    public final int HEAD = 0;
    public final int TAIL = 1;
    private int face;


    //Constructor to initialize the coin when created
    public CoinFlipOOP() {
        flip();
    }


    //Mutator Method (public): method to flip tail or heaad
    public void flip() {
        //Generates 0 or 1 using Math.random()
        face = (int)(Math.random()*2);
    }


    //Accessor Method (public): method to determine the head or tail
    public boolean isHead() {
        return (face == HEAD);
    }
}
