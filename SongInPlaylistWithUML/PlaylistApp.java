import java.util.Scanner;

public class PlaylistApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Music Hub!");
        
        // 1. Create the parts (Songs)
        Song track1 = new Song("22", "Taylor Swift", 5.55);
        Song track2 = new Song("High School in Jakarta", "Niki", 3.03);
        Song track3 = new Song("Gabriella", "Katseye", 3.50);

        // 2. Aggregate songs into a playlist
        System.out.print("Enter a name for your new playlist: ");
        String pName = scanner.nextLine();
        
        // Aggregation relationship: PlaylistApp "has a" Playlist 
        // which in turn "has" three Song objects.
        Playlist myMix = new Playlist(pName, track1, track2, track3);

        // 3. Execute the algorithm: play the tracks
        myMix.playAll();

        System.out.println("\nUpdate: Changing some track details..");
        // 4. Modify the song objects directly because this is Aggregation.
        track1.setTitle("22 (Remix)");  // Update title for the first track
        track2.setDuration(3.30); // Update duration for the second track
        
        // 5. Execute the algorithm: play the tracks
        myMix.playAll();  
    
    }
}