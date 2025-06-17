package library;

import org.bson.Document;

public class BookDocument {
    public static Document toDocument(Book book, String type) {
        return new Document("title", book.title)
                .append("author", book.author)
                .append("type", type);
    }
}
