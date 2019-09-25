package datastructures.graph;

import datastructures.stacksandqueues.Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph<T> {

    private ArrayList<Node<T>> vertices;

    public Graph(){
        this.vertices = new ArrayList<Node<T>>();
    }

    public ArrayList<Node<T>> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Node<T>> vertices) {
        this.vertices = vertices;
    }

    public Node addNode(T value){
        Node newNode = new Node(value);
//        ArrayList<Node<T>> currentNodes = this.getVertices();
//        currentNodes.add(newNode);
        //this.setVertices(currentNodes);
        this.getVertices().add(newNode);
        return newNode;
    }

    public void addEdge(Node<T> nodeStart, Node<T> nodeEnd, int weight) {
        if (this.getVertices().contains(nodeStart) && this.getVertices().contains(nodeEnd)) {
            nodeStart.addNeighbor(nodeEnd, weight);
            nodeEnd.addNeighbor(nodeStart, weight);
        }
    }
    public ArrayList<Node<T>> getNeighbors(Node<T> node) {
        return node.getNeighbors();
    }
    public int size(){
        return this.vertices.size();
    }
    public ArrayList<Node<T>> getNodes() {
        return vertices;
    }

    @Override
    public String toString() {
        if (vertices.size() == 0){return null;}
        StringBuilder s = new StringBuilder();
        for (Node n : vertices){
            s.append(n.toString());
            s.append(", ");
        }
        return s.toString().replaceAll(", $", "");
    }

}
