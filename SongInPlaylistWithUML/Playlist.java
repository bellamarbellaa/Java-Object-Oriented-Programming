public class Playlist {
    private String playlistName;
    // Aggregation: The Playlist "has" these Song objects
    private Song s1;
    private Song s2;
    private Song s3;

    // Constructor to aggregate the songs into this specific list
    public Playlist(String name, Song song1, Song song2, Song song3) {
        this.playlistName = name;
        this.s1 = song1;
        this.s2 = song2;
        this.s3 = song3;
    }

    public void playAll() {
        System.out.println("--- Playing Playlist: " + playlistName + " ---");
        System.out.println("Now Playing: " + s1);
        System.out.println("Up Next: " + s2);
        System.out.println("Final Track: " + s3);
    }
}