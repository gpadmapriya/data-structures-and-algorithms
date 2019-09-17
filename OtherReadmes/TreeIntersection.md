### FizzBuzz Tree
Find common values in 2 binary trees

#### Challenge
- Write a function called tree_intersection that takes 2 binary trees as argument
- Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.

#### Approach and Efficiency
- inOrder traversal of trees - Get node data from both trees. Add data from tree1 to hashtable. Check if data in tree2 is already in hashtable 
  - Time efficiency - O(n)
  - Space efficiency - O(n)

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/tree/TreeIntersection/TreeIntersection.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/tree/TreeIntersection/TreeIntersectionTest  .java)

![Tree Intersection](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/tree_intersection.JPG)