package datastructures.tree;

public class Node<T> {
    protected T data;
    protected Node<T> right;
    protected Node<T> left;
    public Node(T value){
        data = value;
        right = null;
        left = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}

