package datastructures.graph;

import java.util.HashMap;
import java.util.HashSet;

public class Node<T> {
    private T value;
    private HashMap<Node<T>, Integer> neighbors;

    public Node(T value){
        this.value = value;
        this.neighbors = new HashMap<>();
    }

    public HashMap<Node<T>, Integer> getNeighbors() {
        return neighbors;
    }

    public T getValue() {
        return value;
    }

    public void setNeighbors(HashMap<Node<T>, Integer> neighbors) {
        this.neighbors = neighbors;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void addNeighbor(Node<T> node, Integer weight) {
        HashMap<Node<T>, Integer> currentNeighbors = this.getNeighbors();
        currentNeighbors.put(node, weight);
        this.setNeighbors(currentNeighbors);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
