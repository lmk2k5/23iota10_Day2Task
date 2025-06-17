package library;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {
    private static final String URI = "mongodb://localhost:27017";
    private static MongoClient client;

    public static MongoDatabase getDatabase(String dbName) {
        if (client == null) {
            client = MongoClients.create(URI);
        }
        return client.getDatabase(dbName);
    }
}
