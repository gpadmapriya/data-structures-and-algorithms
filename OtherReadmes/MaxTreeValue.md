#### Maximum value in a binary tree
Find the maximum value in a binary tree

#### Challenge
- Write an instance method called findMaximumValue in binary tree class that returns the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

#### Approach and Efficiency
- Check data iteratively using a queue. Compare data to a max value. If data in node is greater than max, reset max to the data in node.
  - Time efficiency - O(n)
  - Space efficiency - O(n)

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/tree/BinaryTree.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/tree/BinaryTreeTest.java)

![Maximum value in Binary tree](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/maximum_value.JPG)