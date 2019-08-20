package datastructures.stacksandqueues;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    public boolean isEmpty(){
        if (stack1.isEmpty() && stack2.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public void enqueue (T value){

           while (!stack2.isEmpty()) {
                T data = stack2.pop();
                stack1.push(data);
            }
        stack1.push(value);

    }

    public T dequeue(){
        if (this.isEmpty()){
            throw new NoSuchElementException("Queue is empty. Cannot dequeue");
        } else {
            while (!stack1.isEmpty()) {
                T data = stack1.pop();
                stack2.push(data);
            }
            return stack2.pop();
        }
    }
}
