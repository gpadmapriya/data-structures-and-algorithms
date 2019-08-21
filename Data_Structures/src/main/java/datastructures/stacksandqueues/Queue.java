package datastructures.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    protected Node<T> front = null;
    protected Node<T> rear = null;

    public String enqueue(T value){
        Node newNode = new Node(value);
        String result = "";
        if (front == null){
            front = newNode;
            rear = front;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        return "Element enqueued";
    }
    public T dequeue(){
        if (this.front == null){
            throw new NoSuchElementException("Queue is empty. Cannot dequeue");
        } else {
            T returnValue = front.data;
            front = front.next;
            return returnValue;
        }
    }
    public T peek(){
        if (this.front == null){
            throw new NoSuchElementException("Queue is empty. Cannot peek");
        } else {
            return front.data;
        }
    }
    public boolean isEmpty(){
        if (this.front == null){
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        String returnString = "";
        if (front == null) {
            returnString = "No values in queue. Front is null";
        } else {
            Node start = front;
            returnString = "Values in the queue: ";
            while (start != null) {
                returnString = returnString + start.data + " ";
                start = start.next;
            }
        }
        return returnString.trim();
    }
}
