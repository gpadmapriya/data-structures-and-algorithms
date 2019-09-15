### HashTable
Implement a Hashtable

#### Challenge
- Create a Node class to store the value and pointer to next node.
- Create a HashTable class with the following methods
  - add: takes in a key and a value, hashes the key, adds key value pair to hashtable and handles collisions as needed
  - get: takes in a key and returns the value for the key from the table
  - contains: takes in a key and returns a boolean indicating if the key exists in the table
  - hash: takes in a key and returns an index in the collection

#### Approach and Efficiency
  - Create a Java library and add a package with 2 classes inside - A Node class and a HashTable class
  - add method always inserts at the front of the linked list. Instantiate a new Node. Set its next to point to fromt and then set it as the front node. Time efficiency - O(1).
  - get method takes in a key and returns the value. In case of collisions, the method iterates through the linked list to get the correct value. Time efficiency - O(n).
  - contains method returns a boolean Time efficiency - O(n) in case of collisions.
  - hash method hashes the key and returns an index. Time efficiency - O(1)
  
#### API
- Instantiate HashTable with HashTable<T> newTable = new HashTable<>(). 
- Methods Available
  - add(T key, T value) 
  - hash(String key)  
  - get(T key)
  - contains(T key)
  - size()

[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/hashtable)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/hashtable)