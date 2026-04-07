package BookInBookshelfWithUML;

public class Book {
    //USING AI
    // 1. Instance Data (Private for Encapsulation)
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;


    // 2. Constructor
    public Book(String t, String a, String p, int date) {
        title = t;
        author = a;
        publisher = p;
        copyrightDate = date;
    }


    // 3. toString Method to Display Each Book
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author +
               "\nPublished by: " + publisher + " (" + copyrightDate + ")\n";
    }


    // 4. Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }


    public String getAuthor() { return author; }
    public void setAuthor(String a) { author = a; }


    public String getPublisher() { return publisher; }
    public void setPublisher(String p) { publisher = p; }


    public int getCopyrightDate() { return copyrightDate; }
    public void setCopyrightDate(int date) { copyrightDate = date; }
}
