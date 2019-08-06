# data-structures-and-algorithms
- 301
  - [code challenge 1 - forEach](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/for-each)
  - [code challenge 2 - pass by value and pass by reference](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/code-challenges/challenges-02.test.js)
  - [code challenge 3 - Sort](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/sort)
  - [code challenge 4 - Regular expressions part 1](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/regex)
  - [code challenge 5 - split, join, slice, splice](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/string-manipulation)
  - [code challenge 6 - Object.keys, Object.values, Object.entries](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/keysAndValues)
  - [code challenge 7 - Map](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/map)
  - [code challenge 8 - Filter](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/filter)
  - [code challenge 9 - Reduce](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/reduce)
  - [code challenge 10 - chaining methods](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/chaining)
  - [code challenge 11 - Regular expressions part 2](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/regex2)
  - [code challenge 12 - Two dimensional arrays](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/2DArrays)
  - [code challenge 13 - Includes, substring, every, chatAt](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/substring)
  - [code challenge 14 - combination of all array methods](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/code-challenges/methods)

- 401
## code challenge 1 - Reverse an array
- write a function called reverseArray that takes an array of integers as input and returns   the array in reversed order without using any of the available in-built methods.

- Approach: Instantiate a new array of integers. Length would be same as input array. Iterate over the input array (using a for loop) copying elements from the front of the array to the end of the output array. Decrement output array index by 1 for each run of the for loop.

- Efficiency: time <- O(n) - as we are iterating over the input array from beginning to end.
space <- O(n) - as we create a new array with n elements.

- [Solution](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/code401challenges/ArrayReverse.java) 
![Reversing an array](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/array_reverse.JPG)