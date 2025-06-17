package library;

public class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }

    public void displayDetails() {
        System.out.println("Fiction Book: " + title + " by " + author);
    }
}
