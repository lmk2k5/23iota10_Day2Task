package bank;

import org.bson.Document;

public class AccountDocument {

    public static Document toDocument(Account acc) {
        return new Document("accountNumber", acc.getAccountNumber())
                .append("balance", acc.getBalance());
    }

    public static Account fromDocument(Document doc) {
        Account acc = new Account(doc.getString("accountNumber"));
        acc.setBalance(doc.getDouble("balance"));
        return acc;
    }
}
