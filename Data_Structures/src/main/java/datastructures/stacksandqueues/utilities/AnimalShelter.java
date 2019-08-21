package datastructures.stacksandqueues.utilities;

import datastructures.stacksandqueues.Node;
import datastructures.stacksandqueues.Queue;

import java.util.NoSuchElementException;

public class AnimalShelter {
    Queue<Animal> dogQueue = new Queue<Animal>();
    Queue<Animal> catQueue = new Queue<Animal>();

    public String enqueue(Animal animal){
        String returnString = "";
        if (animal.getCatOrDog().equals("cat")){
            catQueue.enqueue(animal);
            returnString = "Cat added in line";
        } else if (animal.getCatOrDog().equals("dog")){
            dogQueue.enqueue(animal);
            returnString = "Dog added in line";
        } else {
            returnString = "Animal is not a cat or dog. Cannot be added to queue";
        }
        return returnString;
    }
    public Animal dequeue(String pref){
        Animal luckyPet = new Animal();
        if (pref.equals("cat") || (pref.equals("Cat"))){
            try {
                luckyPet = catQueue.dequeue();
            } catch (NoSuchElementException e){
                System.out.println("No cats in line");
                luckyPet = null;
            }
        } else if (pref.equals("dog") || (pref.equals("Dog"))){
            try {
                luckyPet = dogQueue.dequeue();
            } catch (NoSuchElementException e){
                System.out.println("No dogs in line");
                luckyPet = null;
            }
        } else {
            luckyPet = null;
        }
        return luckyPet;
    }
}
