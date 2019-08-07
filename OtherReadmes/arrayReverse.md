## code challenge 1 - Reverse an array
- write a function called reverseArray that takes an array of integers as input and returns   the array in reversed order without using any of the available in-built methods.

- Approach: Instantiate a new array of integers. Length would be same as input array. Iterate over the input array (using a for loop) copying elements from the front of the array to the end of the output array. Decrement output array index by 1 for each run of the for loop.

- Efficiency: time <- O(n) - as we are iterating over the input array from beginning to end.
space <- O(n) - as we create a new array with n elements.

- [Solution](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/ArrayReverse.java) 
![Reversing an array](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/array_reverse.JPG)