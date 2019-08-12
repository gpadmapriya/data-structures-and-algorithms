package datastructures.linkedList;

import org.junit.Test;
import static org.junit.Assert.*;


public class LinkedListTest {
    @Test
    public void testInstantiateEmptyLinkedList(){
       datastructures.linkedList.LinkedList emptyList = new datastructures.linkedList.LinkedList();
       String emptyLinkedList = emptyList.toString();
       assertEquals("No values in linked list. Head is null", emptyLinkedList);
    }

    @Test
    public void testInsertIntoEmptyLinkedList(){
        datastructures.linkedList.LinkedList insertIntoEmptyList = new datastructures.linkedList.LinkedList();
        String insertIntoEmptyString = insertIntoEmptyList.insert(4);
        int data = insertIntoEmptyList.head.data;
        assertEquals("No elements in linked list. Inserting as head", insertIntoEmptyString);
        assertEquals(4, data);
    }

    @Test
    public void testInsertIntoLinkedListWithOneNode(){
        datastructures.linkedList.LinkedList listWithOneNode = new datastructures.linkedList.LinkedList();
        listWithOneNode.insert(4);
        String listWithOneNodeReturnString = listWithOneNode.insert(6);
        assertEquals("Inserted 6 as the head node", listWithOneNodeReturnString);
    }

    @Test
    public void testInsertIntoLinkedListWithMultipleNodes(){
        datastructures.linkedList.LinkedList listWithMultipleNodes = new datastructures.linkedList.LinkedList();
        listWithMultipleNodes.insert(4);
        listWithMultipleNodes.insert(6);
        String listWithMultipleNodesReturnString = listWithMultipleNodes.insert(10);
        assertEquals("Inserted 10 as the head node", listWithMultipleNodesReturnString);
    }

    @Test
    public void testHeadProperty(){
        datastructures.linkedList.LinkedList newList = new datastructures.linkedList.LinkedList();
        newList.insert(4);
        newList.insert(6);
        newList.insert(10);
        assertEquals(10, newList.head.data);
    }

    @Test
    public void testValueExists(){
        datastructures.linkedList.LinkedList testValueExistsList = new datastructures.linkedList.LinkedList();
        testValueExistsList.insert(4);
        testValueExistsList.insert(6);
        testValueExistsList.insert(10);
        assertEquals(true, testValueExistsList.includes(4));
    }

    @Test
    public void testValueDoesNotExist(){
        datastructures.linkedList.LinkedList testValueDoesNotExistList = new datastructures.linkedList.LinkedList();
        testValueDoesNotExistList.insert(4);
        testValueDoesNotExistList.insert(6);
        testValueDoesNotExistList.insert(10);
        assertEquals(false, testValueDoesNotExistList.includes(11));
    }

    @Test
    public void testtoString(){
        datastructures.linkedList.LinkedList toStringList = new datastructures.linkedList.LinkedList();
        toStringList.insert(4);
        toStringList.insert(6);
        toStringList.insert(10);
        toStringList.insert(13);
        toStringList.insert(1);
        assertEquals("Values in the linked list: 1 13 10 6 4", toStringList.toString());
    }

}
