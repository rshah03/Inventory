package mongo;

import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

public class MongoSetup {
    private MongoClient client;
    private DB database;

    public MongoSetup() {
        try {
            client = new MongoClient("localhost", 27017);
        } catch (UnknownHostException e) {
            System.out.println("Error connecting to host.");
        }

        database = client.getDB("inventory");
    }

    public MongoClient getMongoClient() { return client; }
    public DB getDatabase() { return database; }
}
