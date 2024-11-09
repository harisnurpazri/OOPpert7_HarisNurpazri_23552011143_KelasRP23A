package newprojectprogram;
public class Book extends Library {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String libraryname, String building, String title, String author) {
        super(libraryname, building);
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
