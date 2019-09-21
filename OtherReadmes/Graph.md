### Graph
Implement a Graph

#### Challenge
- The graph should be represented as an adjacency list and should include following methods
  - addNode(): Adds a new node to the graph, takes in the value of the node and returns the new node
  - addEdge(): Returns all nodes in the graph as a collection
  - getNodes(): Takes in a key and returns a boolean indicating if the key exists in the table
  - getNeighbors(): Takes in a node and returns a collection of nodes connected to the given node. 
  - size(): Returns the total number of nodes in the graph

#### Approach and Efficiency
  - Create a Java library and add a package with 2 classes inside - A Node class and a Graph class
  - add method always inserts at the front of the linked list. Instantiate a new Node. Set its next to point to fromt and then set it as the front node. Time efficiency - O(1).
  - get method takes in a key and returns the value. In case of collisions, the method iterates through the linked list to get the correct value. Time efficiency - O(n).
  - contains method returns a boolean Time efficiency - O(n) in case of collisions.
  - hash method hashes the key and returns an index. Time efficiency - O(1)
  
#### API
- Instantiate Graph with Graph<T> newGraph = new Graph<>(). 
- Methods Available
  - addNode(T value) 
  - addEdge(Node<T> nodeStart, Node<T> nodeEnd, int weight)  
  - getNodes()
  - getNeighbors(Node<T> node)
  - size()

[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/graph)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/graph)