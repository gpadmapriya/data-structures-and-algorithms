# data-structures-and-algorithms
- 301
  - [code challenge 1 - forEach](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/for-each)
  - code challenge 2 - pass by value and pass by reference
  - code challenge 3 - Sort
  - code challenge 4 - Regular expressions part 1
  - code challenge 5 - split, join, slice, splice
  - code challenge 6 - Object.keys, Object.values, Object.entries
  - code challenge 7 - Map
  - code challenge 8 - Filter
  - code challenge 9 - Reduce
  - code challenge 10 - chaining methods
  - code challenge 11 - Regular expressions part 1
  - code challenge 12 - Two dimensional arrays
  - code challenge 13 - Includes, substring, every, chatAt
  - code challenge 14 - combination of all array methods

- 401
## code challenge 1 - Reverse an array
- write a function called reverseArray that takes an array of integers as input and returns   the array in reversed order without using any of the available in-built methods.

- Approach: Instantiate a new array of integers. Length would be same as input array. Iterate over the input array (using a for loop) copying elements from the front of the array to the end of the output array. Decrement output array index by 1 for each run of the for loop.

- Efficiency: time <- O(n) - as we are iterating over the input array from beginning to end.
space <- O(n) - as we create a new array with n elements.

- Solution 
![Reversing an array](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/array_reverse.JPG)