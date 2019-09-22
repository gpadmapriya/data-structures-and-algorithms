package datastructures.graph;

import datastructures.graph.BreadthFirst.BreadthFirst;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BreadthFirstTest {

    public Graph<String> newGraph1 = new Graph<>();

    BreadthFirst bf = new BreadthFirst();
    Node<String> nodeA = newGraph1.addNode("Pandora");
    Node<String> nodeB = newGraph1.addNode("Arendelle");
    Node<String> nodeC = newGraph1.addNode("Metropolis");
    Node<String> nodeD = newGraph1.addNode("Monstropolis");
    Node<String> nodeE = newGraph1.addNode("Narnia");
    Node<String> nodeF = newGraph1.addNode("Naboo");

    @Test
    public void testBreadthFirst() {

        newGraph1.addEdge(nodeA, nodeB, 10);
        newGraph1.addEdge(nodeA, nodeC, 20);
        assertTrue(bf.breadthFirst(nodeA).get(0).equals("Pandora"));
        assertTrue(bf.breadthFirst(nodeA).get(1).equals("Arendelle"));
        assertTrue(bf.breadthFirst(nodeA).get(2).equals("Metropolis"));
    }

    @Test
    public void testBreadthFirst_NoEdges() {

        //newGraph1.addEdge(nodeA, nodeC, 20);
        assertTrue(bf.breadthFirst(nodeA).get(0).equals("Pandora"));
        assertTrue(bf.breadthFirst(nodeA).size() == 1);

    }
    @Test
    public void testBreadthFirst_MoreLevels() {

        newGraph1.addEdge(nodeA, nodeB, 1);
        newGraph1.addEdge(nodeA, nodeC, 1);
        newGraph1.addEdge(nodeB, nodeD, 1);
        newGraph1.addEdge(nodeC, nodeD, 1);
        newGraph1.addEdge(nodeC, nodeE, 1);
        newGraph1.addEdge(nodeC, nodeF, 1);

        newGraph1.addEdge(nodeE, nodeF, 1);
        newGraph1.addEdge(nodeD, nodeF, 1);
        assertTrue(bf.breadthFirst(nodeA).get(0).equals("Pandora"));
        assertTrue(bf.breadthFirst(nodeA).get(3).equals("Monstropolis"));
        assertTrue(bf.breadthFirst(nodeA).size() == 6);

    }
}