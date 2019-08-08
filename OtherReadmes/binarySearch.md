## code challenge 3 - Binary search in a sorted 1D array
- write a function called binarySearch that takes an array of integers and a search value as  input parameters and returns the index of the array's element that is equal to the search key. Function should return -1 if the element does not exist in the input array. 

- Approach: 
  - Get begin index and end index of input array. 
  - Have a while loop executing while begin index < end index.
  - Get midpoint in array (begin index + end index) / 2.
  - If element @ midpoint in array = search key, return midpoint. 
  - Else if element @midpoint < search key, set begin index to midpoint + 1 and search the upper half of the array.
  - Else if element @midpoint > search key, set end index to midpoint - 1 and search the lower half of the array.
  - when begin index > end index, quit while loop and return -1 if search key has not been found


- Efficiency: time <- O(log n) - as we are decreasing number of array elements searched by half during each iteration.

- [Link to Code](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/BinarySearch.java) 
- [Link to tests](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/code401challenges/src/test/java/code401challenges/BinarySearchTest.java)
![Binary search in sorted 1D array](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/binary_search.JPG)