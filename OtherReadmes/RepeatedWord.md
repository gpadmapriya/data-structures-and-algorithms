### Find the first repeated word in a book
Find the first repeated word in an input string from a book

#### Challenge
- Write a function called that accepts a lengthy string parameter
- Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.

#### Approach and Efficiency
- Split input string into array of words
- Instantiate a hashtable (key: word, Value: number of times the word appears in the input string)
- For each word in the array, if the word is already in the hashtable, return it as the first repeated word, else add it to hashtable
- Return message if no repeated words are found
- Time efficiency - O(n)
- Space efficiency - O(n)

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/hashtable/RepeatedWord/RepeatedWord.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/hashtable/RepeatedWordTest.java)

![Find first Repeated Word](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/repeated_word.JPG)