#### Challenge
- Create a class called AnimalShelter which holds only dogs and cats. The shelter operates on a first in first out basis. 
- Write a method called enqueue(animal) which adds the animal to the shelter. Animal can be a dog or a cat
- Write a method called dequeue(pref) that takes in a preferred animal and returns that from the queue. If preferred animal is not a cat or a dog, return null.

#### Approach and Efficiency
  - Create AnimalShelter class that has 2 queues as instance variables - a cat queue and a dog queue. Use the queue class created previoulsy. 
  - Create an Animal class that has an instance variable to differentiate a dog from cat
  - We could have a dog class and a cat class extend from Animal class too. This approach is not followed here due to the simplicity of the problem domain.
  - enqueue method adds to the dog queue if the animal is a dog or to the cat queue if the animal is a cat else returns a string with message that animal cannot be added to queue. Time efficiency - O(1).
  - dequeue method returns a cat from the cat queue if preferred animal is a cat, returns a dog from the dog queue if the preferred animal is a dog, returns null if a dog or cat is not preferred. Time efficiency - O(1).

#### API
- Instantiate AnimalShelter (example) AnimalShelter newAnimalShelter = new AnimalShelter(). Upon instantiation, an instance of animal shelter with 2 empty queues (dog queue and a cat queue) is created. 
- Methods Available
  - enqueue(Animal animal) - animal can be dog or cat
  - dequeue(preferrence) - preferrence should be dog or cat, else return null  

[Code](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/main/java/datastructures/stacksandqueues/utilities)

[Test Cases](https://github.com/gpadmapriya/data-structures-and-algorithms/tree/master/Data_Structures/src/test/java/datastructures/stacksandqueues/utilities) 

![Animal Shelter](https://github.com/gpadmapriya/data-structures-and-algorithms/blob/master/assets/animal_shelter.jpg)