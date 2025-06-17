package library;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MongoDatabase db = MongoConnection.getDatabase("libraryDB");
        MongoCollection<Document> books = db.getCollection("books");

        System.out.print("Enter book type (fiction/nonfiction): ");
        String type = sc.nextLine().trim();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        Book book;
        if (type.equalsIgnoreCase("fiction")) {
            book = new FictionBook(title, author);
        } else {
            book = new NonFictionBook(title, author);
        }

        book.displayDetails();
        books.insertOne(BookDocument.toDocument(book, type));
        System.out.println("Saved to MongoDB.");
    }
}
