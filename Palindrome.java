import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original, cleaned, another = "y";
        int left, right;
        Scanner scan = new Scanner(System.in);


        while (another.equalsIgnoreCase("y")) {
            System.out.println("Enter a potential palindrome: ");
            original = scan.nextLine();


            // 1. Convert to lowercase
            // 2. replaceAll("[^a-zA-Z]", "") removes everything except letters and numbers
            cleaned = original.toLowerCase().replaceAll("[^a-zA-Z]", "");


            left = 0;
            right = cleaned.length() - 1;


            // Check if the cleaned string is empty (e.g., user just typed "!!!")
            if (cleaned.isEmpty()) {
                System.out.println("That contains no letters or numbers to check.");
            } else {
                while (left < right && cleaned.charAt(left) == cleaned.charAt(right)) {
                    left++;
                    right--;
                }


                System.out.println();
                if (left < right) {
                    System.out.println("That string is NOT a palindrome.");
                } else {
                    System.out.println("That string IS a palindrome.");
                }
            }


            System.out.println();
            System.out.print("Test another palindrome (y/n) ? ");
            another = scan.nextLine();
        }
    }
}
