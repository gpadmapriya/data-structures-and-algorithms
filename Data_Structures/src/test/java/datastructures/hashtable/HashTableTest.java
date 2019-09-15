package datastructures.hashtable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HashTableTest {
    @Test
    public void testAddKeyValueToHashTable() {
        HashTable table = new HashTable(4);
        table.add("Padma", "loves to code");
        assertEquals(1, table.size());
    }

    @Test
    public void testRetrieveValueFromHashTable() {
        HashTable table = new HashTable(4);
        table.add("Padma", "loves to code");
        assertEquals("loves to code", table.get("Padma"));
    }
    @Test
    public void testReturnNullFromHashTable() {
        HashTable table = new HashTable(4);
        table.add("Padma", "loves to code");
        assertEquals(null, table.get("test"));
    }

    @Test
    public void testHashFunction() {
        HashTable table = new HashTable(4);
        int hash = table.hash("test");
        assertTrue(0 <= hash && hash <= 3);
    }

    @Test
    public void testCollisionInHashTable() {
        HashTable table = new HashTable(4);
        table.add("Padma", "loves to code");
        table.add("Ananya", "also loves to code");
        table.add("Aarthi", "hates coding");
        assertTrue(table.hash("Aarthi") == table.hash("Padma"));
    }

    @Test
    public void testRetrieveCollidingValuesFromHashTable() {
        HashTable table = new HashTable(4);
        table.add("Padma", "loves to code");
        table.add("Ananya", "also loves to code");
        table.add("Aarthi", "hates coding");
        assertTrue(table.hash("Aarthi") == table.hash("Padma"));
        assertEquals("loves to code", table.get("Padma"));
    }
}
