package datastructures.stacksandqueues;

import datastructures.linkedList.LinkedList;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node front = null;
    private Node rear = null;

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
    public String dequeue(){
        String returnString = "";
        try {
            returnString = front.data.toString();
            front = front.next;
        } catch (NullPointerException e){
            returnString = "Queue is empty. Cannot dequeue";
        }
        return returnString;
    }
    public String peek(){
        String returnString = "";
        try {
            returnString = front.data.toString();

        } catch (NullPointerException e){
            returnString = "Queue is empty. Cannot peek";
        }
        return returnString;
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
