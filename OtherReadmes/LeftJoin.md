### Simplified left join for 2 hashmaps
Find common values in 2 binary trees

#### Challenge
- Write a function called leftJoin that left joins 2 hashmaps into a single data structure
- The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
- The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
- Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
- Avoid utilizing any of the library methods available to your language.

#### Approach and Efficiency
- Instantiate a new result hashtable
- For each element in synonym hashtable
  - If key is present in antonym table - add key, synonym and antonym to result hashtable
  - If key is not present in antonym table - add key, synonym, null to result hashtable
  - Time efficiency - O(n) - Iterate through all items in hashtable
  - Space efficiency - O(n) - new hashtable for result

#### Solution
[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/hashtable/LeftJoin/LeftJoin.java)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/hashtable/LeftJoin/LeftJoinTest.java)

![Left Join](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/left_join.JPG)