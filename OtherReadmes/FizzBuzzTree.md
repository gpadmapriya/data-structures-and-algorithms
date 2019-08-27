### FizzBuzz Tree
Conduct “FizzBuzz” on a tree while traversing through it. Change the values of each of the nodes dependent on the current node’s value

#### Challenge
- Write a function called FizzBuzzTree that takes a tree as an argument
- Determine whether or not the value of each node is divisible by 3, 5 or both, and change the    value of each of the nodes:
  - If the value is divisible by 3, replace the value with “Fizz”
  - If the value is divisible by 5, replace the value with “Buzz”
  - If the value is divisible by 3 and 5, replace the value with “FizzBuzz” 
- Return the tree with the new values

#### Approach and Efficiency
- inOrder traversal of the tree - Return data iteratively using a stack. 
  - Time efficiency - O(n)
  - Space efficiency - O(n)

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/stacksandqueues/utilities/FizzBuzzTree.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/stacksandqueues/utilities/FizzBussTreeTest.java)

![FizzBuzz Tree](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/fizzbuzz_tree.jpg)