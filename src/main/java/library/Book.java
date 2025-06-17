package library;

public abstract class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void displayDetails();
}
