### Depth First graph traversal
Conduct a depth first preorder traversal on a graph

#### Challenge
- Create a function that accepts an adjacency list as a graph, and conducts a depth first traversal. Return a collection of nodes in their pre-order depth-first traversal order.
- Avoid utilizing any of the library methods available to your language.

#### Approach and Efficiency
- Instantiate a new result arraylist, a new arraylist for keeping track of visited nodes and a new stack for the nodes
- If input node is null, return an empty arraylist. If not, push the node and mark as visited
- Get all neighbors of the current node.
  - If neighbor not visited already, add to visited nodes arraylist and push to stack
- Add current node's value to the result arraylist
- Pop and repeat getting neighbors and pushing nodes onto stack until all nodes are visited
- Retun the result arraylist after all nodes are visited
- Time efficiency - O(n) - Iterate through all nodes in graph
- Space efficiency - O(n) - new arraylist, stack with n elements

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/graph/DepthFirst/DepthFirst.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/graph/DepthFirst/DepthFirstTest.java)

![Graph - Depth First Traversal](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/graph_depthfirst_traversal.JPG)