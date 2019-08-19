### Stacks
Implement a Stack Data Structure

#### Challenge
- Create a Node class to store the value and pointer to next node.
- Create a Stack class 
  - Upon instantiation, an empty Stack should be created with a default empty value assigned to top node
  - Write a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) time performance
  - Write a method called pop that does not take any argument, removes the node from the top of the stack and returns the node's value.
  - Write a method called peek that does not take an argument and returns the value of the node located on top without removing it from stack.
  - Catch and handle any exception

#### Approach and Efficiency
  - Create a Java library and add a package with 2 classes inside - A Node class and a Stack class
  - push method always inserts at the top. Instantiate a new Node. Set its next to point ti top and then set it as the top node. Time efficiency - O(1).
  - pop method sets the second to top node as the top node and returns the current top's data. Time efficiency - O(1).
  - peek method returns top node's data without removing it from the stack. Time efficiency - O(1).
  
#### API
- Instantiate stack with Stack<T> newStack = new Stack<>(). Upon instantiation, an empty stack is created. 
- Methods Available
  - push(T value) Inserts a new node at the top of the stack with the passed in value.
  - pop() Returns the value of the top node and removes it from the stack. 
  - peek() Returns the value of the top node without removing it from the stack.
  - toString() - Returns a string with all elements in the stack from top to bottom
    - example: Values in the stack: 1 13 10 6 4

[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/stacksandqueues)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/stacksandqueues)