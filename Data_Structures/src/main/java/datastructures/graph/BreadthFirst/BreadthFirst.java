package datastructures.graph.BreadthFirst;

import datastructures.stacksandqueues.Queue;

import java.util.*;

import datastructures.graph.Node;
import datastructures.graph.Graph;


public class BreadthFirst<T> {
    public ArrayList<T> breadthFirst(Node<T> nodeBegin) {

        ArrayList<T> returnValues = new ArrayList<>();
        ArrayList<Node> visitedNodes = new ArrayList<>();
        Queue<Node> graphNodeQueue = new Queue<>();

        if (nodeBegin != null) {
            graphNodeQueue.enqueue(nodeBegin);
            visitedNodes.add(nodeBegin);

            while (!graphNodeQueue.isEmpty()) {

                Node current = graphNodeQueue.dequeue();
                ArrayList<Node> neighbors = current.getNeighbors();
                for (Node neighbor: neighbors) {
                    if (!visitedNodes.contains(neighbor)) {
                        graphNodeQueue.enqueue(neighbor);
                        visitedNodes.add(neighbor);
                    }
                }
                returnValues.add((T) current.getValue());
            }

        }
        return returnValues;
    }

}
