public class StringMutation {
    public static void main(String[] args) {
        String phrase = new String("Change is inevitable");
        String mutation1, mutation2, mutation3, mutation4, mutation5;


        System.out.println("Original string: \"" + phrase + "\"");
       
        System.out.println("Length of the string: " + phrase.length());


        mutation1 = phrase.concat(", except from vending machines");
        System.out.println("Mutation #1: \"" + mutation1 + "\"");


        mutation2 = mutation1.toUpperCase();
        System.out.println("Mutation #2: \"" + mutation2 + "\"");


        mutation3 = mutation2.replace('E', 'X');
        System.out.println("Mutation #3: \"" + 
mutation3 + "\"");


        mutation4 = mutation3.toLowerCase();
        System.out.println("Mutation #4: \"" + mutation4 + "\"");


        mutation5 = mutation4.substring(3, 30);
        //substring method creates a new string out of the original string
        //using beginning index and end index paramters with first index = 0
        //and end index not included in the new string (count of by 2)
        System.out.println("Mutation #5: " + mutation5);
    }
}

