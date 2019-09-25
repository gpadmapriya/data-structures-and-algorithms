package datastructures.graph.DepthFirst;

import datastructures.graph.Graph;
import datastructures.graph.Node;
import datastructures.stacksandqueues.Stack;

import java.util.ArrayList;

public class DepthFirst<T> {

    //Pre order graph traversal given a node
    public static ArrayList<Node> depthFirstPreOrderTraversal(Node nodeBegin) {

        ArrayList<Node> returnValues = new ArrayList<>();
        ArrayList<Node> visitedNodes = new ArrayList<>();
        Stack<Node> graphNodeStack = new Stack<>();

            if (nodeBegin != null) {
                graphNodeStack.push(nodeBegin);
                visitedNodes.add(nodeBegin);
                while (!graphNodeStack.isEmpty()) {
                    Node current = graphNodeStack.pop();

                    ArrayList<Node> neighbors = current.getNeighbors();
                    for (Node neighbor : neighbors) {
                        if (!visitedNodes.contains(neighbor)) {
                            graphNodeStack.push(neighbor);
                            visitedNodes.add(neighbor);
                        }
                    }
                    returnValues.add(current);
                }
            }

        return returnValues;
    }

    //Pre order graph traversal given an adjacency list
    public static ArrayList<Node> depthFirstPreOrderTraversal1(Graph adjacencyList) {

        ArrayList<Node> returnValues = new ArrayList<>();
        ArrayList<Node> visitedNodes = new ArrayList<>();
        Stack<Node> graphNodeStack = new Stack<>();

        ArrayList<Node<String>> nodes = adjacencyList.getVertices();

        for (Node n : nodes) {
            if (!visitedNodes.contains(n)) {
                graphNodeStack.push(n);
                //visitedNodes.add(n);
                while (!graphNodeStack.isEmpty()) {
                    Node current = graphNodeStack.pop();
                    if (!visitedNodes.contains(current)) {
                        System.out.println("In here-----");
                        visitedNodes.add(current);
                        returnValues.add(current);
                        ArrayList<Node> neighbors = current.getNeighbors();
                        for (Node neighbor : neighbors) {
                            //System.out.println(neighbor.toString());
                            if (!visitedNodes.contains(neighbor)) {
                                graphNodeStack.push(neighbor);
                                //visitedNodes.add(neighbor);
                            }
                        }
                    }
                }
            }
        }
        return visitedNodes;
    }
}

