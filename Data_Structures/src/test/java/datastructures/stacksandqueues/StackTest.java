package datastructures.stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void testInstantiateEmptyStack() {
        datastructures.stacksandqueues.Stack<String> newStack = new Stack<String>();
        String stack = newStack.toString();
        assertEquals("No elements in stack", "No values in stack. Top is null", stack);
    }
    @Test
    public void testPushIntoEmptyStack() {
        datastructures.stacksandqueues.Stack<String> pushIntoEmptyStack = new datastructures.stacksandqueues.Stack<String>();
        String insertIntoEmptyString = pushIntoEmptyStack.push("4");
        assertEquals("No elements in Stack. Inserting as top node", insertIntoEmptyString);
        assertEquals("Values in the stack: 4", pushIntoEmptyStack.toString());
    }
    @Test
    public void testPushMultipleValuesToStack() {
        datastructures.stacksandqueues.Stack<String> newStack = new Stack<String>();
        newStack.push("10");
        newStack.push("20");
        newStack.push("30");
        newStack.push("40");
        String stack = newStack.toString();
        assertEquals("Values in the stack: 40 30 20 10", stack);
    }
    @Test
    public void testPopOffStack() {
        datastructures.stacksandqueues.Stack<String> newStack = new Stack<String>();
        newStack.push("10");
        newStack.push("20");
        newStack.push("30");
        newStack.push("40");
        String stack = newStack.pop();
        assertEquals("40", stack);
    }
    @Test(expected = NoSuchElementException.class)
    public void testPopMultipleValuesOffStack() {
        datastructures.stacksandqueues.Stack<String> newStack = new Stack<String>();
        newStack.push("10");
        newStack.push("20");
        newStack.push("30");
        newStack.pop();
        newStack.pop();
        newStack.pop();
        String stack = newStack.pop();
    }
    @Test
    public void testPeekStack() {
        datastructures.stacksandqueues.Stack<Integer> newPeekStack = new Stack<Integer>();
        newPeekStack.push(10);
        newPeekStack.push(20);
        newPeekStack.push(30);
        newPeekStack.pop();
        newPeekStack.pop();
        int stack = newPeekStack.peek();
        assertEquals(10, stack);
    }
    @Test(expected = NoSuchElementException.class)
    public void testPeekEmptyStack() {
        datastructures.stacksandqueues.Stack<String> newStack = new Stack<>();
        newStack.push("10");
        newStack.push("20");
        newStack.push("30");
        newStack.pop();
        newStack.pop();
        newStack.pop();
        String stack = newStack.peek();

    }
}
