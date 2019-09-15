package datastructures.hashtable;

public class Node <T> {
    public T key;
    public T value;
    public Node<T> next;

    public void setNext(Node node) { this.next = node; }
    public void setKey(T key) { this.key = key; }
    public void setValue(T value) { this.value = value; }

    public Node(T key, T value) {
        setKey(key);
        setValue(value);
    }
}
