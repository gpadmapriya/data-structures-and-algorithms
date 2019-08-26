package datastructures.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void testInstantiateEmptyBST() {
        BinarySearchTree bst = new BinarySearchTree();
        List returnValues = bst.preOrder(bst.root);
        assertEquals("Instantiate empty BST", new ArrayList(), returnValues);
    }

    @Test
    public void testInstantiateBSTWithSingleNode() {
        BinarySearchTree bst = new BinarySearchTree(4);
        List returnValues = bst.preOrder(bst.root);
        List testValues = new ArrayList();
        testValues.add(4);
        assertEquals("Instantiate BST with single root node", testValues, returnValues);
    }
    @Test
    public void testAddToBST() {
        BinarySearchTree bst = new BinarySearchTree(10);
        Node right = new Node(12);
        Node left = new Node(5);
        bst.root.left = left;
        bst.root.right = right;
        bst.add(7);
        List returnValues = bst.preOrder(bst.root);
        List testValues = new ArrayList();
        testValues.add(10);
        testValues.add(5);
        testValues.add(7);
        testValues.add(12);
        assertEquals("Add Node to BST", testValues, returnValues);
    }
    @Test
    public void testCheckIfExistsInBST() {
        BinarySearchTree bst = new BinarySearchTree(10);
        Node right = new Node(12);
        Node left = new Node(5);
        bst.root.left = left;
        bst.root.right = right;
        bst.add(7);
        assertTrue(bst.contains(bst.root, 12));
    }
    @Test
    public void testCheckIfNotInBST() {
        BinarySearchTree bst = new BinarySearchTree(10);
        Node right = new Node(12);
        Node left = new Node(5);
        bst.root.left = left;
        bst.root.right = right;
        bst.add(7);
        assertFalse(bst.contains(bst.root, 13));
    }
}
