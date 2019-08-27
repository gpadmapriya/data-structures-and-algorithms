package datastructures.stacksandqueues.utilities;

import datastructures.tree.BinaryTree;
import datastructures.tree.Node;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class FizzBuzzTreeTest {
    @Test
    public void testFizzBuzzTree() {
        /*
                10
               / \
              9   15
             / \   / \
            3   5  4  7
        */

        BinaryTree<Object> fizzBuzzTree = new BinaryTree<>();
        fizzBuzzTree.setRoot(new Node(10));
        fizzBuzzTree.getRoot().setLeft(new Node(9));
        fizzBuzzTree.getRoot().setRight(new Node(15));

        fizzBuzzTree.getRoot().getLeft().setLeft(new Node (3));
        fizzBuzzTree.getRoot().getLeft().setRight(new Node (5));
        fizzBuzzTree.getRoot().getRight().setLeft((new Node(4)));
        fizzBuzzTree.getRoot().getRight().setRight((new Node(7)));
        fizzBuzzTree.inOrder(fizzBuzzTree.getRoot());
        BinaryTree newTree = FizzBuzzTree.fizzBuzzTree(fizzBuzzTree);

        ArrayList<Object> fizzBuzzList = new ArrayList<>();
        fizzBuzzList.add("Fizz");
        fizzBuzzList.add("Fizz");
        fizzBuzzList.add("Buzz");
        fizzBuzzList.add("Buzz");
        fizzBuzzList.add(4);
        fizzBuzzList.add("FizzBuzz");
        fizzBuzzList.add(7);

        assertEquals("Values should be replaced in tree", fizzBuzzList, newTree.inOrder(newTree.getRoot()));
    }

    @Test
    public void testNoFizzBuzzValues() {
        /*
                13
               /   \
              4     8
             / \   / \
            2   7  11  14
        */

        BinaryTree<Object> fizzBuzzTree = new BinaryTree<>();
        fizzBuzzTree.setRoot(new Node(13));
        fizzBuzzTree.getRoot().setLeft(new Node(4));
        fizzBuzzTree.getRoot().setRight(new Node(8));

        fizzBuzzTree.getRoot().getLeft().setLeft(new Node (2));
        fizzBuzzTree.getRoot().getLeft().setRight(new Node (7));
        fizzBuzzTree.getRoot().getRight().setLeft((new Node(11)));
        fizzBuzzTree.getRoot().getRight().setRight((new Node(14)));

        BinaryTree newTree = FizzBuzzTree.fizzBuzzTree(fizzBuzzTree);

        ArrayList<Object> fizzBuzzList = new ArrayList<>();
        fizzBuzzList.add(2);
        fizzBuzzList.add(4);
        fizzBuzzList.add(7);
        fizzBuzzList.add(13);
        fizzBuzzList.add(11);
        fizzBuzzList.add(8);
        fizzBuzzList.add(14);

        assertEquals("Values should remain same in tree", fizzBuzzList, newTree.inOrder(newTree.getRoot()));
    }
    @Test
    public void testEmptyFizzBuzzTree() {
        BinaryTree<Object> fizzBuzzTree = new BinaryTree<>();

        BinaryTree newTree = FizzBuzzTree.fizzBuzzTree(fizzBuzzTree);

        assertEquals(new ArrayList<>(), newTree.inOrder(newTree.getRoot()));
    }
}
