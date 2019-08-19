package datastructures.stacksandqueues;

public class Node<T> {
    public T data;
    public Node next;
    public Node(T value){
        data = value;
        next = null;
    }
}
