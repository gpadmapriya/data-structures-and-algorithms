### Quick Sort
Implement quick sort based on the pseudocode provided

#### Challenge
- Complete a working, tested implementation of quick sort based on the pseudocode provided. Input is an array of integer elements. Output is the same array with elements sorted in ascending order.
- Create a blog post on understanding the quicksort algorithm.

#### Pseudocode
![Pseudocode](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/quick_sort_pseudocode.png)

#### Approach and Efficiency
- Make the right most index value as pivot
- partition the array using the pivot value
- quicksort left partition recursively
- quicksort right partition recursively

  - Time efficiency - O(N*n)
  - Space efficiency - O(N log N)

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/algorithms/QuickSort.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/algorithms/QuickSortTest.java)