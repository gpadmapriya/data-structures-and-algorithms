package datastructures.graph.GetEdge;

import datastructures.graph.Graph;
import datastructures.graph.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GetEdge {
    public static String getEdge(Graph route, String[] cities){
        Node startCity = null;
        HashMap<Node<String>, Integer> neighbors;
        int cost = 0;
        boolean hasDirectFlight = false;

        ArrayList<Node<String>> cityNodes = route.getVertices();
        for (Node n: cityNodes){
            if (cities[0] == n.getValue()){
                startCity = n;
            }
        }

        for (int i = 1; i < cities.length; i++) {
            neighbors = startCity.getWeights();

            for (Map.Entry<Node<String>,Integer> entry : neighbors.entrySet()){

                if (entry.getKey().getValue().equals(cities[i])){
                    cost = cost + entry.getValue();
                    startCity = entry.getKey();
                    hasDirectFlight = true;
                }
            }
            if (!hasDirectFlight){
                return "False, $0";
            } else {
                hasDirectFlight = false;
            }
        }
        return "True, $" + cost;
    }
}
