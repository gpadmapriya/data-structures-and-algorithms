package datastructures.graph;

import datastructures.graph.DepthFirst.DepthFirst;
import org.junit.Test;
import static org.junit.Assert.*;

public class DepthFirstTest {


    Graph<String> newGraph1 = new Graph<>();

    Node<String> nodeA = newGraph1.addNode("A");
    Node<String> nodeB = newGraph1.addNode("B");
    Node<String> nodeC = newGraph1.addNode("C");
    Node<String> nodeG = newGraph1.addNode("G");
    Node<String> nodeD = newGraph1.addNode("D");
    Node<String> nodeE = newGraph1.addNode("E");
    Node<String> nodeH = newGraph1.addNode("H");
    Node<String> nodeF = newGraph1.addNode("F");

    @Test
    public void testDepthFirstPreOrderTraversal() {
        newGraph1.addEdge(nodeA, nodeD, 1);
        newGraph1.addEdge(nodeA, nodeB, 1);
        newGraph1.addEdge(nodeB, nodeC, 1);
        newGraph1.addEdge(nodeB, nodeD, 1);
        newGraph1.addEdge(nodeC, nodeG, 1);
        newGraph1.addEdge(nodeD, nodeF, 1);

        newGraph1.addEdge(nodeD, nodeH, 1);
        newGraph1.addEdge(nodeF, nodeH, 1);
        newGraph1.addEdge(nodeD, nodeE, 1);

       assertEquals("[A, B, C, G, D, E, H, F]", DepthFirst.depthFirstPreOrderTraversal(nodeA).toString());
    }
    @Test
    public void testDepthFirst_NoEdges() {

        assertEquals("[A]", DepthFirst.depthFirstPreOrderTraversal(nodeA).toString());

    }
    @Test
    public void testDepthFirst_MissingEdges() {
        newGraph1.addEdge(nodeA, nodeD, 1);
        newGraph1.addEdge(nodeA, nodeB, 1);
        newGraph1.addEdge(nodeB, nodeC, 1);

        assertEquals("[A, B, C, D]", DepthFirst.depthFirstPreOrderTraversal(nodeA).toString());
    }
}
