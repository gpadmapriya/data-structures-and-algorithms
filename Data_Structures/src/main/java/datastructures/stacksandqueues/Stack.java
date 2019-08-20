package datastructures.stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {
    public Node<T> top = null;

    public String push(T value){
        Node newNode = new Node(value);
        String result = "";
        if (this.top == null) {
            this.top = newNode;
            result = "No elements in Stack. Inserting as top node";
        } else {
            newNode.next = this.top;
            this.top = newNode;
            result = "Inserted " + top.data + " as the top node";
        }
        return result;
    }

    public boolean isEmpty(){
        if (this.top == null){
            return true;
        } else {
            return false;
        }
    }
    public T pop(){
        if (this.isEmpty()){
            throw new NoSuchElementException("Stack is empty. Cannot pop");
        } else {
            T returnValue = top.data;
            top = top.next;
            return returnValue;
        }
    }
    public T peek(){
        if (this.isEmpty()){
            throw new NoSuchElementException("Stack is empty. Cannot peek");
        } else {
            T returnValue = top.data;
            return returnValue;
        }
    }
    public String toString() {
        String returnString = "";
        if (top == null) {
            returnString = "No values in stack. Top is null";
        } else if (top.next == null) {
            returnString = "Values in the stack: " + top.data;
        } else {
            Node start = top;
            returnString = "Values in the stack: ";
            while (start.next != null) {
                returnString = returnString + start.data + " ";
                start = start.next;
            }
            returnString = returnString + start.data;
        }
        return returnString;
    }
}
