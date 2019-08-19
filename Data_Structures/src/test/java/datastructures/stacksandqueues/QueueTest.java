package datastructures.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    @Test
    public void testInstantiateEmptyQueue() {
        datastructures.stacksandqueues.Queue<String> instantiateNewQueue = new Queue<String>();
        String queueString = instantiateNewQueue.toString();
        assertEquals("No elements in queue", "No values in queue. Front is null", queueString);
    }
    @Test
    public void testEnqueueIntoEmptyQueue() {
        datastructures.stacksandqueues.Queue<String> pushIntoEmptyQueue = new datastructures.stacksandqueues.Queue<String>();
        String insertIntoEmptyString = pushIntoEmptyQueue.enqueue("4");
        assertEquals("Element enqueued", insertIntoEmptyString);
        assertEquals("Values in the queue: 4", pushIntoEmptyQueue.toString());
    }
    @Test
    public void testEnqueueMultipleValues() {
        datastructures.stacksandqueues.Queue<String> newQueue = new Queue<String>();
        newQueue.enqueue("10");
        newQueue.enqueue("20");
        newQueue.enqueue("30");
        newQueue.enqueue("40");
        String queue = newQueue.toString();
        assertEquals("Values in the queue: 10 20 30 40", queue);
    }
    @Test
    public void testDequeue() {
        datastructures.stacksandqueues.Queue<String> newQueue = new Queue<String>();
        newQueue.enqueue("10");
        newQueue.enqueue("20");
        newQueue.enqueue("30");
        newQueue.enqueue("40");
        String queue = newQueue.dequeue();
        assertEquals("10", queue);
    }
    @Test
    public void testDequeueMultipleValues() {
        datastructures.stacksandqueues.Queue<String> newQueue = new Queue<>();
        newQueue.enqueue("10");
        newQueue.enqueue("20");
        newQueue.enqueue("30");
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        String queue = newQueue.dequeue();
        assertEquals("Queue is empty. Cannot dequeue", queue);
    }
    @Test
    public void testPeekQueue() {
        datastructures.stacksandqueues.Queue<Integer> newPeekQueue = new Queue<>();
        newPeekQueue.enqueue(10);
        newPeekQueue.enqueue(20);
        newPeekQueue.enqueue(30);
        String queue = newPeekQueue.peek();
        assertEquals("10", queue);
    }
    @Test
    public void testPeekEmptyQueue() {
        datastructures.stacksandqueues.Queue<String> newQueue = new Queue();
        newQueue.enqueue("10");
        newQueue.enqueue("20");
        newQueue.enqueue("30");
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        String queue = newQueue.peek();
        assertEquals("Queue is empty. Cannot peek", queue);
    }
}
