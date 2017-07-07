package inventory;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import mongo.MongoSetup;

public class InventoryOps {

    MongoSetup setup;

    public InventoryOps() {
        MongoClient client = setup.getMongoClient();
        DB database = setup.getDatabase();
        System.out.println(database.collectionExists("inventory"));
    }
}
