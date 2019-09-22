package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Node<T> {
    private T value;
    private HashMap<Node<T>, Integer> weights;
    private ArrayList<Node<T>> neighbors;

    public Node(T value){
        this.value = value;
        this.weights = new HashMap<>();
        this.neighbors = new ArrayList<>();
    }

    public ArrayList<Node<T>> getNeighbors() {
        return neighbors;
    }

    public T getValue() {
        return value;
    }

    public void setNeighbors(ArrayList<Node<T>> neighbors) {
        this.neighbors = neighbors;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public HashMap<Node<T>, Integer> getWeights() {
        return weights;
    }

    public void setWeights(HashMap<Node<T>, Integer> weights) {
        this.weights = weights;
    }

    public void addNeighbor(Node<T> node, Integer weight) {
        HashMap<Node<T>, Integer> weights = this.getWeights();
        ArrayList<Node<T>> currentNeighbors = this.getNeighbors();
        currentNeighbors.add(node);
        this.setNeighbors(currentNeighbors);
        weights.put(node, weight);
        this.setWeights(weights);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
