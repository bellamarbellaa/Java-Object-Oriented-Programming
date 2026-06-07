public class Song {
    // Private attributes (-)
    private String title;
    private String artist;
    private double duration;

    // Constructor to set up the song
    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Public methods (+) to access data
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }
    public double getDuration() { return duration; }
    public void setDuration(double duration) { this.duration = duration; }

    @Override
    public String toString() {
        return "Song: " + title + " by " + artist + " [" + duration + " mins]";
    }
}