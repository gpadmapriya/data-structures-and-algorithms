package datastructures.stacksandqueues;

import java.util.EmptyStackException;

public class Stack<T> {
    public Node top = null;

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

    public String pop(){
        String returnString = "";
        try {
            returnString = top.data.toString();
            top = top.next;
        } catch (NullPointerException e){
            returnString = "Stack is empty. Cannot pop";
        }
        return returnString;
    }
    public String peek(){
        String returnString = "";
        try {
            returnString = top.data.toString();
        } catch (NullPointerException e){
            returnString = "Stack is empty. Cannot peek";
        }
        return returnString;
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
