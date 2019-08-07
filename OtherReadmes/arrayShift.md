## code challenge 2 - Insert and shift an array in middle at index
- write a function called insertShiftArray that takes an array of integers and value to be added at the middle index as input and returns an array with the newly added value included without using any of the available in-built methods.

- Approach: Instantiate a new array of integers. Length 1 more than input array's length. Iterate over the input array (using a for loop) till mid point of the array copying elements from input array to the same indices in the output array. Assign the value to be added to the next element in the output array. Continue iterating through input array and copy the rest of the elements to output array. Return output array.

- Efficiency: time <- O(n) - as we are iterating over the input array from beginning to end.
space <- O(n) - as we create a new array with n elements.

- [Solution](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/code401challenges/ArrayShift.java) 
![Insert element at middle index of an array](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/array_shift.JPG)