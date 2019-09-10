### Merge Sort
Implement merge sort based on the pseudocode provided

#### Challenge
- Complete a working, tested implementation of merge sort based on the pseudocode provided. Input is an array of integer elements. Output is the same array with elements sorted in ascending order.
- Create a blog post on understanding the merge algorithm.

#### Pseudocode
![Pseudocode](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/merge_sort_pseudocode.png)

#### Approach and Efficiency
- Divide the unsorted list into N sublists, each containing 1 element
- Take adjacent pairs of two lists and merge them to form a list of 2 elements 
- Repeat above until a single sorted list is obtained

  - Time efficiency - O(N log N)
  - Space efficiency - O(n)

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/algorithms/MergeSort.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/algorithms/MergeSortTest.java)