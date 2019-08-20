package datastructures.stacksandqueues;

public class Node<T> {
    protected T data;
    protected Node<T> next;
    public Node(T value){
        data = value;
        next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
