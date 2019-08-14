package datastructures.linkedList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class LinkedListTest {

    @Test
    public void testInstantiateEmptyLinkedList() {
        datastructures.linkedList.LinkedList emptyList = new datastructures.linkedList.LinkedList();
        String emptyLinkedList = emptyList.toString();
        assertEquals("No values in linked list. Head is null", emptyLinkedList);
    }

    @Test
    public void testInsertIntoEmptyLinkedList() {
        datastructures.linkedList.LinkedList insertIntoEmptyList = new datastructures.linkedList.LinkedList();
        String insertIntoEmptyString = insertIntoEmptyList.insert(4);
        int data = insertIntoEmptyList.head.data;
        assertEquals("No elements in linked list. Inserting as head", insertIntoEmptyString);
        assertEquals(4, data);
    }

    @Test
    public void testInsertIntoLinkedListWithOneNode() {
        datastructures.linkedList.LinkedList listWithOneNode = new datastructures.linkedList.LinkedList();
        listWithOneNode.insert(4);
        String listWithOneNodeReturnString = listWithOneNode.insert(6);
        assertEquals("Inserted 6 as the head node", listWithOneNodeReturnString);
    }

    @Test
    public void testInsertIntoLinkedListWithMultipleNodes() {
        datastructures.linkedList.LinkedList listWithMultipleNodes = new datastructures.linkedList.LinkedList();
        listWithMultipleNodes.insert(4);
        listWithMultipleNodes.insert(6);
        String listWithMultipleNodesReturnString = listWithMultipleNodes.insert(10);
        assertEquals("Inserted 10 as the head node", listWithMultipleNodesReturnString);
    }

    @Test
    public void testHeadProperty() {
        datastructures.linkedList.LinkedList newList = new datastructures.linkedList.LinkedList();
        newList.insert(4);
        newList.insert(6);
        newList.insert(10);
        assertEquals(10, newList.head.data);
    }

    @Test
    public void testValueExists() {
        datastructures.linkedList.LinkedList testValueExistsList = new datastructures.linkedList.LinkedList();
        testValueExistsList.insert(4);
        testValueExistsList.insert(6);
        testValueExistsList.insert(10);
        assertEquals(true, testValueExistsList.includes(4));
    }

    @Test
    public void testValueDoesNotExist() {
        datastructures.linkedList.LinkedList testValueDoesNotExistList = new datastructures.linkedList.LinkedList();
        testValueDoesNotExistList.insert(4);
        testValueDoesNotExistList.insert(6);
        testValueDoesNotExistList.insert(10);
        assertEquals(false, testValueDoesNotExistList.includes(11));
    }

    @Test
    public void testtoString() {
        datastructures.linkedList.LinkedList toStringList = new datastructures.linkedList.LinkedList();
        toStringList.insert(4);
        toStringList.insert(6);
        toStringList.insert(10);
        toStringList.insert(13);
        toStringList.insert(1);
        assertEquals("Values in the linked list: 1 13 10 6 4", toStringList.toString());
    }

    @Test
    public void testAppend() {
        datastructures.linkedList.LinkedList toStringList = new datastructures.linkedList.LinkedList();
        toStringList.insert(4);
        toStringList.insert(6);
        toStringList.insert(10);
        toStringList.insert(13);
        toStringList.insert(1);
        toStringList.append(20);
        assertEquals("Values in the linked list: 1 13 10 6 4 20", toStringList.toString());
    }

    @Test
    public void testAppendMultipleNodes() {
        datastructures.linkedList.LinkedList appendList = new datastructures.linkedList.LinkedList();
        appendList.insert(4);
        appendList.insert(6);
        appendList.insert(10);
        appendList.append(13);
        appendList.append(1);
        appendList.append(20);
        assertEquals("Values in the linked list: 10 6 4 13 1 20", appendList.toString());
    }

    @Test
    public void testInsertBeforeMiddle() {
        datastructures.linkedList.LinkedList insertList = new datastructures.linkedList.LinkedList();
        insertList.insert(4);
        insertList.insert(6);
        insertList.insert(10);
        insertList.insertBefore(6, 13);
        assertEquals("Values in the linked list: 10 13 6 4", insertList.toString());
    }

    @Test
    public void testInsertBeforeFirst() {
        datastructures.linkedList.LinkedList insertFirstList = new datastructures.linkedList.LinkedList();
        insertFirstList.insert(4);
        insertFirstList.insert(6);
        insertFirstList.insert(10);
        insertFirstList.insertBefore(10, 13);
        assertEquals("Values in the linked list: 13 10 6 4", insertFirstList.toString());
    }

    @Test
    public void testInsertAfterMiddle() {
        datastructures.linkedList.LinkedList insertList = new datastructures.linkedList.LinkedList();
        insertList.insert(4);
        insertList.insert(6);
        insertList.insert(10);
        insertList.insertAfter(6, 13);
        assertEquals("Values in the linked list: 10 6 13 4", insertList.toString());
    }

    @Test
    public void testInsertAfterLast() {
        datastructures.linkedList.LinkedList insertFirstList = new datastructures.linkedList.LinkedList();
        insertFirstList.insert(4);
        insertFirstList.insert(6);
        insertFirstList.insert(10);
        insertFirstList.insertAfter(4, 13);
        assertEquals("Values in the linked list: 10 6 4 13", insertFirstList.toString());
    }

    @Test
    public void testKthFromEndListSize1() throws LinkedList.indexException {
        datastructures.linkedList.LinkedList kThFromEndList = new datastructures.linkedList.LinkedList();
        kThFromEndList.insert(4);
        int value = kThFromEndList.kthFromEnd(0);
        assertEquals(4, value);
    }

    @Test
    public void whenExceptionThrown_thenRuleIsApplied() throws LinkedList.indexException {
        /* LinkedList.indexException.expect(exception); */
        LinkedList.indexException.expectMessage("Index out of range");
        datastructures.linkedList.LinkedList kThFromEndList = new datastructures.linkedList.LinkedList();
        kThFromEndList.insert(4);
        int value = kThFromEndList.kthFromEnd(1);
    }

    @Test
    public void testKthFromEndNegativeK() throws LinkedList.indexException {
        datastructures.linkedList.LinkedList kThFromEndList = new datastructures.linkedList.LinkedList();
        kThFromEndList.insert(4);
        int value = kThFromEndList.kthFromEnd(-6);
        assertEquals("Index out of range", -1, value);
    }

    @Test
    public void testKthFromEndKGreaterThanLength() throws LinkedList.indexException {
        datastructures.linkedList.LinkedList kThFromEndList = new datastructures.linkedList.LinkedList();
        kThFromEndList.insert(2);
        kThFromEndList.insert(8);
        kThFromEndList.insert(3);
        kThFromEndList.insert(1);
        int value = kThFromEndList.kthFromEnd(6);
        assertEquals("Index out of range", -1, value);
    }

    @Test
    public void testKthFromEndKSameAsLength_EdgeCase() throws LinkedList.indexException {
        //Should throw an exception as length is calculated from 1 whereas K starts from 0
        datastructures.linkedList.LinkedList kThFromEndList = new datastructures.linkedList.LinkedList();
        kThFromEndList.insert(2);
        kThFromEndList.insert(8);
        kThFromEndList.insert(3);
        kThFromEndList.insert(1);
        int value = kThFromEndList.kthFromEnd(4);
        assertEquals("Index out of range", -1, value);
    }

    @Test
    public void testKthFromEnd_HappyPath() throws LinkedList.indexException {
        //Should throw an exception as length is calculated from 1 whereas K starts from 0
        datastructures.linkedList.LinkedList kThFromEndList = new datastructures.linkedList.LinkedList();
        kThFromEndList.insert(2);
        kThFromEndList.insert(8);
        kThFromEndList.insert(3);
        kThFromEndList.insert(1);
        int value = kThFromEndList.kthFromEnd(2);
        assertEquals(3, value);
    }
}
