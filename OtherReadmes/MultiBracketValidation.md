#### Challenge Description
- Multi Bracket Validation
- Write a function that takes a string as its argument and returns a boolean representing whether or not the brackets in the string are balanced.
- There are 3 types of brackets to validate
  - round ()
  - curly {}
  - square []

#### Approach and Efficiency
- If the input string is empty or has spaces only or does not have any brackets, return false.
- Else iterate through the characters in the string, push them into a stack if they are one of the opening bracket types being considered.
- If the character is a closing bracket, pop the top item from stack and compare to the current character. If they are a matching pair of opening and closing brackets, continue iterating. Else return false as they are mismatching bracket types.
- At the end of iteration, the stack should be empty (number of characters pushed to and popped from the stack should be equal)
- Time efficiency - Big O(n) as it is an iteration through the characters in the string

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/stacksandqueues/utilities/MultiBracketValidation.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/stacksandqueues/utilities/MultiBracketValidationTest.java) 

![Multi Bracket Validation](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/multi_bracket_validation.JPG)