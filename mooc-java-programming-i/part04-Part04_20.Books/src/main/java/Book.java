
public class Book {
    private String title;
    private int pages;
    private int yearOfPublishing;
    
    public Book(String title, int pages, int yearOfPublishing) {
        this.title = title;
        this.pages = pages;
        this.yearOfPublishing = yearOfPublishing;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.yearOfPublishing;
    }
}
