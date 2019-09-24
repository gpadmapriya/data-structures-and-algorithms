### Get graph edge
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?

#### Challenge
- Write a function which takes in a graph, and an array of city names and returns whether the full trip is possible with direct flights and how much it would cost.
- Avoid utilizing any of the library methods available to your language.

#### Approach 
- Get all nodes in the graph and get the first city in the itinerary.
- Get all neighbors for this city
- If next city is a neighbor, add weight to cost. Continue with next location
- If next city not a neighbor, return false

#### Efficiency
- Time efficiency - O(n^2) - Nested for loop for checking all neighbors for each of the nodes in the itinerary
- Space efficiency - O(n) - Arraylist to get all nodes, hashmap to get all neighbors for a node

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/graph/GetEdge/GetEdge.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/graph/GetEdgeTest.java)

![Graph - Get Edge(Travel Itinerary)](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/graph_get_edge.JPG)