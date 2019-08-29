package datastructures.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {
    @Test
    public void testInstantiateEmptyTree() {
        BinaryTree bt = new BinaryTree();
        List returnValues = bt.preOrder(bt.root);
        assertEquals("Instantiate empty tree", new ArrayList(), returnValues);
    }

    @Test
    public void testInstantiateTreeWithSingleNode() {
        BinaryTree bt = new BinaryTree(4);
        List returnValues = bt.preOrder(bt.root);
        List testValues = new ArrayList();
        testValues.add(4);
        assertEquals("Instantiate tree with single root node", testValues, returnValues);
    }
    @Test
    public void testAddLeftAndRightNode() {
        BinaryTree bt = new BinaryTree(4);
        bt.root = new Node(4);
        Node right = new Node(3);
        Node left = new Node(2);
        bt.root.left = left;
        bt.root.right = right;
        List returnValues = bt.inOrder(bt.root);
        List testValues = new ArrayList();
        testValues.add(2);
        testValues.add(4);
        testValues.add(3);
        assertEquals("Add right and left nodes to root node", testValues, returnValues);
    }
    @Test
    public void testPreOrderTraversal() {
        BinaryTree bt = new BinaryTree(4);
        bt.root = new Node(4);
        Node right = new Node(3);
        Node left = new Node(2);
        Node newRight = new Node(7);
        Node newLeft = new Node(6);
        bt.root.left = left;
        bt.root.right = right;
        bt.root.left.right = newRight;
        bt.root.left.left = newLeft;

        List returnValues = bt.preOrder(bt.root);
        List testValues = new ArrayList();
        testValues.add(4);
        testValues.add(2);
        testValues.add(6);
        testValues.add(7);
        testValues.add(3);
        assertEquals("Test preorder traversal", testValues, returnValues);
    }

    @Test
    public void testInOrderTraversal() {
        BinaryTree bt = new BinaryTree(4);
        bt.root = new Node(4);
        Node right = new Node(3);
        Node left = new Node(2);
        Node newRight = new Node(7);
        Node newLeft = new Node(6);
        bt.root.left = left;
        bt.root.right = right;
        bt.root.left.right = newRight;
        bt.root.left.left = newLeft;

        List returnValues = bt.inOrder(bt.root);
        List testValues = new ArrayList();
        testValues.add(6);
        testValues.add(2);
        testValues.add(7);
        testValues.add(4);
        testValues.add(3);
        assertEquals("Test Inorder traversal", testValues, returnValues);
    }
    @Test
    public void testBreadthFirtstTraversal() {
        BinaryTree bt = new BinaryTree(4);
        bt.root = new Node(4);
        Node right = new Node(3);
        Node left = new Node(2);
        Node newRight = new Node(7);
        Node newLeft = new Node(6);
        bt.root.left = left;
        bt.root.right = right;
        bt.root.left.right = newRight;
        bt.root.left.left = newLeft;
        bt.root.right.left = new Node(10);
        bt.root.right.right = new Node(13);
        List returnValues = BinaryTree.breadthFirst(bt);

        List testValues = new ArrayList();
        testValues.add(4);
        testValues.add(2);
        testValues.add(3);
        testValues.add(6);
        testValues.add(7);
        testValues.add(10);
        testValues.add(13);
        assertEquals("Test Breadth First traversal", testValues, returnValues);
    }

    @Test
    public void testMaximumAtLeaf() {
        BinaryTree bt = new BinaryTree(2);
        Node right = new Node(5);
        Node left = new Node(7);
        Node newRight = new Node(6);
        Node newLeft = new Node(2);
        bt.root.left = left;
        bt.root.right = right;
        bt.root.left.right = newRight;
        bt.root.left.right.left = new Node(5);
        bt.root.left.right.left = new Node(11);
        bt.root.left.left = newLeft;

        bt.root.right.right = new Node(9);
        bt.root.right.right.right = new Node(13);

        int max = bt.findMaximumValue();

        assertEquals("Max value at leaf level", 13, max);
    }
    @Test
    public void testMaximumAtRoot() {
        BinaryTree bt = new BinaryTree(15);
        Node right = new Node(5);
        Node left = new Node(7);
        Node newRight = new Node(6);
        Node newLeft = new Node(2);
        bt.root.left = left;
        bt.root.right = right;
        bt.root.left.right = newRight;
        bt.root.left.right.left = new Node(5);
        bt.root.left.right.left = new Node(11);
        bt.root.left.left = newLeft;

        bt.root.right.right = new Node(9);
        bt.root.right.right.right = new Node(13);

        int max = bt.findMaximumValue();

        assertEquals("Max value at leaf level", 15, max);
    }
    @Test
    public void testMaximumForEmptyTree() {
        BinaryTree bt = new BinaryTree();
        int max = bt.findMaximumValue();
        assertEquals("Max value for empty tree", -1, max);
    }
}
