package bank;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.HashMap;
import java.util.Map;

import static com.mongodb.client.model.Filters.eq;

public class Bank {
    private final Map<String, Account> accounts = new HashMap<>();
    private final MongoCollection<Document> collection;

    public Bank() {
        MongoDatabase db = MongoConnection.getDatabase("bankDB");
        collection = db.getCollection("accounts");

        // Load existing accounts
        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                Account acc = AccountDocument.fromDocument(cursor.next());
                accounts.put(acc.getAccountNumber(), acc);
            }
        }
    }

    public void createAccount(String number) {
        if (accounts.containsKey(number)) {
            throw new IllegalArgumentException("Account already exists.");
        }
        Account acc = new Account(number);
        accounts.put(number, acc);
        collection.insertOne(AccountDocument.toDocument(acc));
    }

    public Account getAccount(String number) {
        Account account = accounts.get(number);
        if (account == null)
            throw new IllegalArgumentException("Account not found.");
        return account;
    }

    public void saveAccount(Account account) {
        collection.replaceOne(eq("accountNumber", account.getAccountNumber()),
                AccountDocument.toDocument(account), new com.mongodb.client.model.ReplaceOptions().upsert(true));
    }
}
