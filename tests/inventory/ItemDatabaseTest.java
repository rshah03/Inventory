package inventory;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ItemDatabaseTest {

    private ItemDatabase itemDatabase;

    @Before
    public void setup() {
        itemDatabase = new ItemDatabase();
    }

    @Test
    public void insertItemInsertsOneItem() {
        Item item = new Item(1234,23145, 12, "SAMPLE", 2, true);
        itemDatabase.addItem(item);
        assertEquals(1, itemDatabase.items.getCount());
    }

    @Test
    public void insertItemInsertsMultipleItems() {
        Item item1, item2;
        item1 = new Item(1234, 52345, 14, "SAMPLE 1", 3, true);
        item2 = new Item(9876, 85897, 14, "SAMPLE 1", 3, true);
        List<Item> items = Arrays.asList(item1, item2);
        for(Item item : items)
            itemDatabase.addItem(item);
        assertEquals(2, itemDatabase.items.getCount());
    }

    @Test
    public void removeOneItemFromDatabase() {
        Item item1, item2;
        item1 = new Item(1234, 52345, 14, "SAMPLE 1", 3, true);
        item2 = new Item(9876, 85897, 14, "SAMPLE 1", 3, true);

        List<Item> items = Arrays.asList(item1, item2);
        for(Item item : items)
            itemDatabase.addItem(item);

        itemDatabase.removeItem(item1);
        assertEquals(1, itemDatabase.items.getCount());
    }

    @Test
    public void removeMultipleItemsfromDatabase() {
        Item item1, item2, item3;
        item1 = new Item(1234, 52345, 14, "SAMPLE 1", 3, true);
        item2 = new Item(9876, 85897, 14, "SAMPLE 1", 3, true);
        item3 = new Item(7321, 75643, 1, "SAMPLE 4", 0, false);

        List<Item> items = Arrays.asList(item1, item2, item3);
        for(Item item : items)
            itemDatabase.addItem(item);

        itemDatabase.removeItem(item1);
        itemDatabase.removeItem(item3);
        assertEquals(1, itemDatabase.items.getCount());
    }

    @After
    public void tearDown() throws Exception {
        itemDatabase.items.drop();
    }
}
