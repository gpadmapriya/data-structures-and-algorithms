package datastructures.graph;

import datastructures.graph.GetEdge.GetEdge;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetEdgeTest {
    @Test
    public void testGetEdge_noDirectFlight() {

        Graph newGraph1 = new Graph();
        Node<String> nodeA = newGraph1.addNode("Pandora");
        Node<String> nodeB = newGraph1.addNode("Arendelle");
        Node<String> nodeC = newGraph1.addNode("Metropolis");
        Node<String> nodeD = newGraph1.addNode("Monstropolis");
        Node<String> nodeE = newGraph1.addNode("Narnia");
        Node<String> nodeF = newGraph1.addNode("Naboo");

        newGraph1.addEdge(nodeA, nodeB, 150);
        newGraph1.addEdge(nodeA, nodeC, 82);
        newGraph1.addEdge(nodeB, nodeD, 42);
        newGraph1.addEdge(nodeC, nodeD, 105);
        newGraph1.addEdge(nodeC, nodeE, 37);
        newGraph1.addEdge(nodeC, nodeF, 26);
        newGraph1.addEdge(nodeB, nodeC, 99);
        newGraph1.addEdge(nodeD, nodeF, 73);
        newGraph1.addEdge(nodeE, nodeF, 250);

        String[] test = {"Narnia", "Arendelle", "Naboo"};
        String retValue = GetEdge.getEdge(newGraph1,test);
        assertEquals( "False, $0", retValue);
    }

    @Test
    public void testGetEdge_directFlight() {

        Graph newGraph1 = new Graph();
        Node<String> nodeA = newGraph1.addNode("Pandora");
        Node<String> nodeB = newGraph1.addNode("Arendelle");
        Node<String> nodeC = newGraph1.addNode("Metropolis");
        Node<String> nodeD = newGraph1.addNode("Monstropolis");
        Node<String> nodeE = newGraph1.addNode("Narnia");
        Node<String> nodeF = newGraph1.addNode("Naboo");

        newGraph1.addEdge(nodeA, nodeB, 150);
        newGraph1.addEdge(nodeA, nodeC, 82);
        newGraph1.addEdge(nodeB, nodeD, 42);
        newGraph1.addEdge(nodeC, nodeD, 105);
        newGraph1.addEdge(nodeC, nodeE, 37);
        newGraph1.addEdge(nodeC, nodeF, 26);
        newGraph1.addEdge(nodeB, nodeC, 99);
        newGraph1.addEdge(nodeD, nodeF, 73);
        newGraph1.addEdge(nodeE, nodeF, 250);

        String[] test = {"Arendelle", "Monstropolis", "Naboo"};
        String retValue = GetEdge.getEdge(newGraph1,test);
        assertEquals( "True, $115", retValue);
    }
    @Test
    public void testGetEdge_noDirectFlight2Cities() {

        Graph newGraph1 = new Graph();
        Node<String> nodeA = newGraph1.addNode("Pandora");
        Node<String> nodeB = newGraph1.addNode("Arendelle");
        Node<String> nodeC = newGraph1.addNode("Metropolis");
        Node<String> nodeD = newGraph1.addNode("Monstropolis");
        Node<String> nodeE = newGraph1.addNode("Narnia");
        Node<String> nodeF = newGraph1.addNode("Naboo");

        newGraph1.addEdge(nodeA, nodeB, 150);
        newGraph1.addEdge(nodeA, nodeC, 82);
        newGraph1.addEdge(nodeB, nodeD, 42);
        newGraph1.addEdge(nodeC, nodeD, 105);
        newGraph1.addEdge(nodeC, nodeE, 37);
        newGraph1.addEdge(nodeC, nodeF, 26);
        newGraph1.addEdge(nodeB, nodeC, 99);
        newGraph1.addEdge(nodeD, nodeF, 73);
        newGraph1.addEdge(nodeE, nodeF, 250);

        String[] test = {"Pandora", "Naboo"};
        String retValue = GetEdge.getEdge(newGraph1,test);
        assertEquals( "False, $0", retValue);
    }

    @Test
    public void testGetEdge_DirectFlight2Cities() {

        Graph newGraph1 = new Graph();
        Node<String> nodeA = newGraph1.addNode("Pandora");
        Node<String> nodeB = newGraph1.addNode("Arendelle");
        Node<String> nodeC = newGraph1.addNode("Metropolis");
        Node<String> nodeD = newGraph1.addNode("Monstropolis");
        Node<String> nodeE = newGraph1.addNode("Narnia");
        Node<String> nodeF = newGraph1.addNode("Naboo");

        newGraph1.addEdge(nodeA, nodeB, 150);
        newGraph1.addEdge(nodeA, nodeC, 82);
        newGraph1.addEdge(nodeB, nodeD, 42);
        newGraph1.addEdge(nodeC, nodeD, 105);
        newGraph1.addEdge(nodeC, nodeE, 37);
        newGraph1.addEdge(nodeC, nodeF, 26);
        newGraph1.addEdge(nodeB, nodeC, 99);
        newGraph1.addEdge(nodeD, nodeF, 73);
        newGraph1.addEdge(nodeE, nodeF, 250);

        String[] test = {"Pandora", "Metropolis"};
        String retValue = GetEdge.getEdge(newGraph1,test);
        assertEquals( "True, $82", retValue);
    }
}
