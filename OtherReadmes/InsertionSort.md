### Insertion Sort
Implement insertion sort based on the pseudocode provided

#### Challenge
- Implement insertion sort based on the pseudocode provided. Input is an array of integer elements. Output is the same array with elements sorted in ascending order.

#### Pseudocode
![Pseudocode](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/insertion_sort_pseudocode.png)

#### Approach and Efficiency
- Iterate through all elements in the input array.
- Compare current element with adjacemt element
- If comparison reveals that the current element can be inserted at a position in the array, space is created for it by shifting other elements one position to the right and then inserting the element in its appropriate position
- Repeat above until all elements in the input array are sorted.

  - Time efficiency - O(n*n)
  - Space efficiency - O(1)

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/algorithms/InsertionSort.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/algorithms/InsertionSortTest.java)
