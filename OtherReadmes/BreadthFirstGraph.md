### Breadth First graph traversal
Implement a breadth first traversal on a graph

#### Challenge
- Extend the graph object with a breadth first traversal method that accepts a starting node and returns a collection of nodes in the order they were visited.
- Avoid utilizing any of the library methods available to your language.

#### Approach and Efficiency
- Instantiate a new result arraylist, a new arraylist for keeping track of visited nodes and a new queue for the nodes
- If input node is null, return an empty arraylist. If not, enqueue the node and mark as visited
- Get all neighbors of the current node.
  - If neighbor not visited already, add to visited nodes arraylist and enqueue
- Add current node's value to the result arraylist
- Dequeue and repeat getting neighbors and enqueuing until all nodes are visited
- Retun the result arraylist after all nodes are visited
- Time efficiency - O(n) - Iterate through all nodes in graph
  - Space efficiency - O(n) - new arraylist, queue with n elements

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/graph/BreadthFirst/BreadthFirst.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/graph/BreadthFirst/BreadthFirstTest.java)

![Graph - Breadth First Traversal](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/graph_breadthfirst_traversal.JPG)