package datastructures.tree;

import datastructures.tree.TreeIntersection.TreeIntersection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    @Test
    public void testDuplicatesInBinaryTree() {
        BinaryTree testTree1 = new BinaryTree(150);
        testTree1.setRoot(new Node(150));
        Node right = new Node(250);
        Node left = new Node(100);
        Node newRight = new Node(160);
        Node newLeft = new Node(75);
        testTree1.getRoot().setLeft(left);
        testTree1.getRoot().setRight(right);
        testTree1.getRoot().getLeft().setRight(newRight);
        testTree1.getRoot().getLeft().setLeft(newLeft);
        testTree1.getRoot().getRight().setLeft(new Node(200));
        testTree1.getRoot().getRight().setRight(new Node(350));

        BinaryTree testTree2 = new BinaryTree(42);
        testTree2.setRoot(new Node(42));
        Node right1 = new Node(600);
        Node left1 = new Node(100);
        Node newRight1 = new Node(160);
        Node newLeft1 = new Node(15);
        testTree2.getRoot().setLeft(left1);
        testTree2.getRoot().setRight(right1);
        testTree2.getRoot().getLeft().setRight(newRight1);
        testTree2.getRoot().getLeft().setLeft(newLeft1);
        testTree2.getRoot().getRight().setLeft(new Node(200));
        testTree2.getRoot().getRight().setRight(new Node(350));

        List returnValues = TreeIntersection.tree_intersection1(testTree1, testTree2);
        List testValues = new ArrayList();
        testValues.add(100);
        testValues.add(160);
        testValues.add(200);
        testValues.add(350);
        assertEquals("Duplicates returned", testValues, returnValues);
    }

    @Test
    public void testEmptyBinaryTrees() {
        BinaryTree testTree1 = new BinaryTree();
        BinaryTree testTree2 = new BinaryTree();

        assertEquals("an empty arraylist is returned",
                new ArrayList<String>(),
                TreeIntersection.tree_intersection1(testTree1, testTree2));

    }

    @Test
    public void testNoDuplicatesInBinaryTree() {
        BinaryTree testTree1 = new BinaryTree(150);
        testTree1.setRoot(new Node(150));
        Node right = new Node(250);
        Node left = new Node(100);
        Node newRight = new Node(160);
        Node newLeft = new Node(75);
        testTree1.getRoot().setLeft(left);
        testTree1.getRoot().setRight(right);
        testTree1.getRoot().getLeft().setRight(newRight);
        testTree1.getRoot().getLeft().setLeft(newLeft);
        testTree1.getRoot().getRight().setLeft(new Node(200));
        testTree1.getRoot().getRight().setRight(new Node(350));

        BinaryTree testTree2 = new BinaryTree(42);
        testTree2.setRoot(new Node(42));
        Node right1 = new Node(60);
        Node left1 = new Node(10);
        Node newRight1 = new Node(260);
        Node newLeft1 = new Node(15);
        testTree2.getRoot().setLeft(left1);
        testTree2.getRoot().setRight(right1);
        testTree2.getRoot().getLeft().setRight(newRight1);
        testTree2.getRoot().getLeft().setLeft(newLeft1);
        testTree2.getRoot().getRight().setLeft(new Node(20));
        testTree2.getRoot().getRight().setRight(new Node(35));

        List returnValues = TreeIntersection.tree_intersection1(testTree1, testTree2);
        List testValues = new ArrayList();
        assertEquals("No Duplicates", testValues, returnValues);
    }

}
