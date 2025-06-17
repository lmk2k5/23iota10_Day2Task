package library;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }

    public void displayDetails() {
        System.out.println("Non-Fiction Book: " + title + " by " + author);
    }
}
