package datastructures.hashtable;

import datastructures.hashtable.LeftJoin.LeftJoin;
import datastructures.tree.BinaryTree;
import datastructures.tree.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftJoinTest {
    @Test
    public void testHappyPathLeftJoin() {
        HashTable synonyms = new HashTable();
        synonyms.add("fond", "enamored");
        synonyms.add("wrath", "anger");
        synonyms.add("outfit", "garb");

        HashTable antonyms = new HashTable();
        antonyms.add("fond", "averse");
        antonyms.add("wrath", "delight");
        antonyms.add("guide", "follow");
        HashTable newTable = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals("enamored,averse", newTable.get("fond"));
    }

    @Test
    public void testNoMatchLeftJoin() {
        HashTable synonyms = new HashTable();
        synonyms.add("fond", "enamored");
        synonyms.add("wrath", "anger");
        synonyms.add("outfit", "garb");

        HashTable antonyms = new HashTable();
        antonyms.add("diligent", "idle");
        antonyms.add("flow", "jam");
        antonyms.add("guide", "follow");
        HashTable newTable = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals("enamored,null", newTable.get("fond"));
    }

    @Test
    public void testEmptyInputTables() {
        HashTable synonyms = new HashTable();
        HashTable antonyms = new HashTable();

        HashTable newTable = LeftJoin.leftJoin(synonyms, antonyms);

        assertEquals(null, newTable.get("fond"));
    }
}

