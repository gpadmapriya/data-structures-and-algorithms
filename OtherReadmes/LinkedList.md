### Singly Linked List
Implement a Singly Linked List Data Structure

#### Challenge
- Create a Node class to store the value and pointer to next node.
- Create a LinkedList class 
  - Upon instantiation, an empty linked list should be created
  - Write a method called insert which takes any value as an argument and adds a new node with that value to the head of the list
  - Write a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
  - Write a method called toString which takes in no arguments and returns a string representing all the values in the Linked List.
  - Catch and handle any exception
  - write a method that appends new nodes with the given value to the end of the linked list
  - write a method that takes in a newValue and a value and adds a new node with the given newValue immediately bofore the first value node
  - write a method that takes in a newValue and a value and adds a new node with the given newValue immediately after the first value node.

  #### Approach and Efficiency
  - Create a Java library and add a package with 2 classes inside - A Node class and a Linked list class
  - insert method always inserts at the head. Instantiate a new Node. Set the Node as the head node after resetting the next node pointer. Time efficiency - O(1).
  - includes method iterates through the linked list and returns a boolean true or false evaluating if a value exists in the list. Time efficiency - O(n).
  - toString method iterates through the list and returns a string with all values in the list. Time efficiency - O(n).
  - append(value) always iterates till the tail and inserts the value at the tail. Time efficiency - O(n).
  - insertBefore(value, newValue) iteartes till value is reached and inserts new value before the given value. Time efficiency - O(n).
  - insertAfter(value, newValue) iteartes till value is reached and inserts new value after the given value. Time efficiency - O(n).

  #### API
  Instantiate linked list with LinkedList newList = new LinkedList(). Upon instantiation, an empty linked list is created. The data type of value is int.
  Methods Available
    - insert(int value) Inserts a new node at the head of the linked list with the passed in value.
    - includes(int value) Checks and returns true or false after evaluating if value is present in the list
    - toString() - Returns a string with all elements in the list
    example: Values in the linked list: 1 13 10 6 4
    - append() adds new node with the given value to the end of the list
    - insertBefore(value, newValue) inserts new node before value node.
    example: input head --> 1 --> 3 --> 2
             insertBefore(3, 5)
             output head --> 1 --> 5 ---> 3 --> 2
    - insertAfter(value, newValue) inserts new node before value node.
    example: input head --> 1 --> 3 --> 2
             insertAfter(3, 5)
             output head --> 1 --> 3 ---> 5 --> 2

  [Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures)

  [Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures)




