package datastructures.stacksandqueues.utilities;

import datastructures.stacksandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AnimalShelterTest {
    @Test
    public void testInstantiateAnimalShelter() {
        AnimalShelter as = new AnimalShelter();
        assertEquals("No elements in queue", "No values in queue. Front is null", as.catQueue.toString());
        assertEquals("No elements in queue", "No values in queue. Front is null", as.dogQueue.toString());
    }
    @Test
    public void testEnqueueVariousAnimals() {
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal turtle = new Animal("turtle");

        AnimalShelter as = new AnimalShelter();
        assertEquals("Dog added in line", as.enqueue(dog));
        assertEquals("Cat added in line", as.enqueue(cat));
        assertEquals("Animal is not a cat or dog. Cannot be added to queue", as.enqueue(turtle));
    }
    @Test
    public void testDequeue() {
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");

        AnimalShelter as = new AnimalShelter();
        as.enqueue(dog);
        as.enqueue(cat);
        assertEquals("This is a dog", as.dequeue("dog").toString());
        assertEquals("This is a cat", as.dequeue("cat").toString());
        assertNull(as.dequeue("turtle"));
    }
    @Test
    public void testDequeueMoreThanQueueHas() {
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");

        Animal anotherDog = new Animal("dog");
        Animal anotherCat = new Animal("cat");

        AnimalShelter as = new AnimalShelter();
        as.enqueue(dog);
        as.enqueue(cat);
        as.enqueue(anotherDog);
        as.enqueue(anotherCat);
        assertEquals("This is a dog", as.dequeue("dog").toString());
        assertEquals("This is a dog", as.dequeue("dog").toString());
        assertNull(as.dequeue("dog"));
        assertEquals("This is a cat", as.dequeue("cat").toString());
        assertEquals("This is a cat", as.dequeue("cat").toString());
        assertNull(as.dequeue("cat"));

    }
}
