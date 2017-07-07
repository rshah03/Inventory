import com.mongodb.Mongo;
import mongo.MongoSetup;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MongoSetupTest {

    private MongoSetup mongoSetup;

    @Before
    public void setup() {
        mongoSetup = new MongoSetup();
    }

    @Test
    public void canary() {
        assertTrue(true);
    }

    @Test
    public void mongoClientWasCreatedAtCorrectPoint() {
        assertNotNull(mongoSetup.getMongoClient());
        assertEquals("localhost:27017", mongoSetup.getMongoClient().getConnectPoint());
    }

    @Test
    public void clientHasDatabase() {
        assertEquals("inventory", mongoSetup.getDatabase().getName());
    }


}
