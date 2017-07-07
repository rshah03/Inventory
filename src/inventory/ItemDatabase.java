package inventory;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import mongo.MongoSetup;

public class ItemDatabase {
    MongoSetup mongoSetup;
    DB itemDB;
    DBCollection items;

    public ItemDatabase() {
        this.mongoSetup = new MongoSetup();
        this.itemDB = mongoSetup.getDatabase();
        this.items = itemDB.getCollection("items");
    }

    public BasicDBObject itemAdapter(Item _item) {
        BasicDBObject item;
        item = new BasicDBObject("_id", _item.getSkuNum());
        item.put("part-id", _item.getPartID());
        item.put("vendor-id", _item.getVendorID());
        item.put("vendor-name", _item.getVendorName());
        item.put("quantity", _item.getQuantity());
        item.put("stock", _item.isInStock());

        return item;
    }

    //TODO: Generate test
    public void addItem(Item _item) { items.insert(itemAdapter(_item)); }

    //TODO: Create method to update item record(s)

    //TODO: Generate test
    public void removeItem(Item _item) {
        BasicDBObject query = new BasicDBObject("_id", _item.getSkuNum());
        items.findAndRemove(query);
    }
}
