### Trees
Implement a Tree Data Structure

#### Challenge
- Create a Node class to store the value, pointer to left child node and a pointer to right child node.
- Create a Binary Tree class 
  - Upon instantiation, an empty Tree should be created with a default empty value assigned to root node
  - Write a method called preOrder that returns an array of the values in the tree. preOrder considers current node before its left and right child nodes
  - Write a method called inOrder that returns an array of the values in the tree. inOrder returns left child value, current node's value and then the right child's value.
  - Write a method called postOrder that returns an array of the values in the tree. postOrder returns left child value, right child's value and then the current node's value.
  - At no time should an exception or stack trace be shown to the end user. 

- Create a Binary Search Tree class
  - Write a method called add that accepts a value and adds a new node with that value in the correct location in the binary search tree.
  - Write a method called contains that accepts a value and returns a boolean indicating whether or not the value is in the tree.

  #### Approach and Efficiency
  - Create a Java library, add a package called tree with 3 classes inside - A Node class, a BinaryTree class and a BinarySearchTree class.
  - preOrder - Return data iteratively using a stack. Push right, left, current node data to stack, pop and to arraylist in that order till a leaf node is reached.
    - Time efficiency - O(n)
    - Space efficiency - O(n)
  - inOrder - Return data iteratively using a stack. 
    - Time efficiency - O(n)
    - Space efficiency - O(n)
  - postOrder - Return data iteratively. 2 stacks are used in this solution to keep track of the order of nodes.
    - Time efficiency - O(n)
    - Space efficiency - O(n)
  - BinarySearchTree extends BinaryTree<Integer>, holds only integer data.
  - addNode identifies the parent of the value to be added iteratively and then inserts to the left or right of the parent depending on the value of the data.
    - Time efficiency - O(n)
    - Space efficiency - O(1)
  - contains accepts a value and returns a boolean indicating whether or not the value is in the tree.
    - Time efficiency - O(n)
    - Space efficiency - O(1)

#### API
- Instantiate BinaryTree with BinaryTree<T> bt = new BinaryTree<>(). Upon instantiation, an empty Tree is created. 
- Methods Available
  - preOrder(Node<T> node) 
  - inOrder(Node<T> node)
  - postOrder(Node<T> node)

- Instantiate BinarySearchTree with BinarySearchTree bst = new BinarySearchTree(). Upon instantiation, an empty Tree is created. 
- Methods Available
  - add(int value) - adds the value to the tree in the right position
  - contains(Node<T> node, int value)

[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/tree)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/tree)
  