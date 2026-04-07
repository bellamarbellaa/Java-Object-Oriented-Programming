package SloganCounter;

public class Slogan {
    private String phrase;
    private static int count = 0;


    // Constructor without 'this'
    public Slogan(String str) {
        phrase = str;
        count++;
    }


    // Returns the current static count
    public static int getCount() {
        return count;
    }


    // Returns the individual phrase
    public String getPhrase() {
        return phrase;
    }
}
