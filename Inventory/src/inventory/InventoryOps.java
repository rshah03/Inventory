package inventory;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import mongo.MongoSetup;

public class InventoryOps {

    MongoSetup setup;
    MongoClient localClient;
    DB localDatabase;
    DBCollection inventory;

    public InventoryOps() {
        setup = new MongoSetup();
        localClient = setup.getMongoClient();
        localDatabase = setup.getDatabase();
        inventory = localDatabase.getCollection("inventory");
    }
}
