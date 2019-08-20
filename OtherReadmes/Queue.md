### Queues
Implement a Queue Data Structure

#### Challenge
- Create a Node class to store the value and pointer to next node.
- Create a Queue class 
  - Upon instantiation, an empty Queue should be created with a default empty value assigned to front node
  - Write a method called enqueue which takes any value as an argument and adds a new node with that value to the rear of the queue with an O(1) time performance
  - Write a method called dequeue that does not take any argument, removes the node from the front of the queue and returns the node's value.
  - Write a method called peek that does not take an argument and returns the value of the node located at front of the queue without removing it from stack.
  - Catch and handle any exception

#### Approach and Efficiency
  - Create a Java library and add a package with 2 classes inside - A Node class and a Queue class
  - enqueue method always inserts at the rear. Instantiate a new Node. Set the reat pointer of the queue to point to the new node. Set the new node as the rear. Time efficiency - O(1).
  - dequeue method removes the node from front and returns its data. Time efficiency - O(1).
  - peek method returns front node's data without removing it from the queue. Time efficiency - O(1).
  
#### API
- Instantiate Queue with Queue<T> newQueue = new Queue<>(). Upon instantiation, an empty queue is created. 
- Methods Available
  - enqueue(T value) Inserts a new node at the rear of the queue with the passed in value.
  - dequeue() Returns the value of the front node and removes it from the queue. 
  - peek() Returns the value of the front node without removing it from the queue.
  - toString() - Returns a string with all elements in the queue from front to rear
    - example: Values in the queue: 1 13 10 6 4

[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/stacksandqueues)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/stacksandqueues)