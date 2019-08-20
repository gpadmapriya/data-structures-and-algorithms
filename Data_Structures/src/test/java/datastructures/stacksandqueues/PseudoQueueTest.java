package datastructures.stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PseudoQueueTest {
    @Test
    public void testInstantiateEmptyStack() {
        PseudoQueue<String> newPseudoQueue = new PseudoQueue<>();
        assertTrue("Queue should be empty on instantiation", newPseudoQueue.isEmpty());
    }
    @Test
    public void testEnqueueIntoEmptyQueue() {
        PseudoQueue<String> pushIntoEmptyQueue = new PseudoQueue<String>();
        pushIntoEmptyQueue.enqueue("4");
        assertEquals("4", pushIntoEmptyQueue.dequeue());
    }
    @Test
    public void testEnqueueMultipleValues() {
        PseudoQueue<String> pushIntoEmptyQueue = new PseudoQueue<>();
        pushIntoEmptyQueue.enqueue("10");
        pushIntoEmptyQueue.enqueue("20");
        pushIntoEmptyQueue.enqueue("30");
        pushIntoEmptyQueue.enqueue("40");
        assertEquals("10", pushIntoEmptyQueue.dequeue());
        assertEquals("20", pushIntoEmptyQueue.dequeue());
    }
    @Test
    public void testEnqueuesAndDequeues() {
        PseudoQueue<String> pushIntoEmptyQueue = new PseudoQueue<>();
        pushIntoEmptyQueue.enqueue("10");
        pushIntoEmptyQueue.enqueue("20");
        pushIntoEmptyQueue.enqueue("30");
        pushIntoEmptyQueue.enqueue("40");
        assertEquals("10", pushIntoEmptyQueue.dequeue());
        pushIntoEmptyQueue.enqueue("50");
        assertEquals("20", pushIntoEmptyQueue.dequeue());
    }
    @Test(expected = NoSuchElementException.class)
    public void testDequeueEmptyQueue() {
        PseudoQueue<String> pushIntoEmptyQueue = new PseudoQueue<>();
        pushIntoEmptyQueue.enqueue("10");
        pushIntoEmptyQueue.enqueue("20");
        pushIntoEmptyQueue.dequeue();
        pushIntoEmptyQueue.dequeue();
        pushIntoEmptyQueue.dequeue();
    }
}
