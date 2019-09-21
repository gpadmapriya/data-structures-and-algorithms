package datastructures.graph;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GraphTest {
    @Test
    public void testAddNodeToGraph() {
        Graph newGraph = new Graph();
        Node n1 = newGraph.addNode(5);
        Node n2 = newGraph.addNode("Test");
        //Node n = (Node)newGraph.getNodes().get(0);
        //Assert that 2 nodes were added to the graph
        assertEquals(2, newGraph.size());
        //Assert that the graph contains the newly added node
        assertTrue(newGraph.getVertices().contains(n1));
    }

    @Test
    public void testAddEdgeToGraph() {
        Graph newGraph = new Graph();
        Node n1 = newGraph.addNode(5);
        Node n2 = newGraph.addNode("Another test");

        newGraph.addEdge(n1, n2, 32);
        HashMap<Node, Integer> newHashMap = new HashMap<>();
        newHashMap.put(n1, 32);

        assertEquals(newHashMap, newGraph.getNeighbors(n2));
    }
    @Test
    public void testGetNodes() {
        Graph newGraph = new Graph();
        Node n1 = newGraph.addNode(21);
        Node n2 = newGraph.addNode("Yet another test");

        ArrayList<Node> nodes = newGraph.getNodes();
        assertTrue(nodes.contains(n2));
    }
    @Test
    public void testGetNeighborsWithWeight() {
        Graph newGraph = new Graph();
        Node n1 = newGraph.addNode(32);
        Node n2 = newGraph.addNode("Yet another test");
        Node n3 = newGraph.addNode(0.5);

        newGraph.addEdge(n1, n2, 10);
        newGraph.addEdge(n2, n3, 30);
        newGraph.addEdge(n3, n1, 20);

        HashMap<Node, Integer> newHashMap = n1.getNeighbors();
        assertEquals(20, (long)newHashMap.get(n3));

    }

    @Test
    public void testGetNeighbors() {
        Graph newGraph = new Graph();
        Node n1 = newGraph.addNode(32);
        Node n2 = newGraph.addNode("Yet another test");
        Node n3 = newGraph.addNode(0.5);

        newGraph.addEdge(n1, n2, 10);
        newGraph.addEdge(n2, n3, 30);
        newGraph.addEdge(n3, n1, 20);

        HashMap<Node, Integer> newHashMap = n1.getNeighbors();
        assertTrue(newHashMap.size() == 2);

    }

    @Test
    public void testGetSize(){
        Graph newGraph = new Graph();
        Node n1 = newGraph.addNode(32);
        assertEquals(1, newGraph.size());

        Node n2 = newGraph.addNode("Yet another test");
        Node n3 = newGraph.addNode(0.5);

        assertEquals(3, newGraph.size());
    }

    @Test
    public void testEmptyGraph(){
        Graph newGraph = new Graph();
        assertEquals(null, newGraph.toString());
    }
}
