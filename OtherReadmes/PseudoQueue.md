### PseudoQueue
Implement a Queue using 2 stacks

#### Challenge
- Create a PseudoQueue class. This should internally utilize 2 stacks. 
- Write a method called enqueue which takes any value as an argument and inserts it into the pseudoqueue using a first in first out approach
- Write a method called dequeue that does not take any argument, returns a value from the pseudoqueue using a first in first out approach. 
- Use previously implemented stack. This has push, pop and peek methods.

#### Approach and Efficiency
  - Add PseudoQueue class to the existing datastructures package. 
  - enqueue method pops from stack2, pushes all values into stack1 and pushes the intended value as the top node of stack1. Time efficiency - O(n).
  - dequeue method pops from stack1, pushes all values into stack2, pops and returns the top value. Time efficiency - O(n).

#### API
- Instantiate PseudoQueue with PseudoQueue<T> newQueue = new PseudoQueue<>(). Upon instantiation, an empty queue is created. 
- Methods Available
  - enqueue(T value) 
  - dequeue()  
  - isEmpty() checks and returns true if queue is empty, false otherwise

[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/stacksandqueues)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/stacksandqueues)

![PseudoQueue implementation](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/pseudo_queue.JPG)