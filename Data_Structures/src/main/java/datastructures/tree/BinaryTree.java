package datastructures.tree;

import datastructures.stacksandqueues.Queue;
import datastructures.stacksandqueues.Stack;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    protected Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T data){
        root = new Node(data);
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    //https://javarevisited.blogspot.com/2016/07/binary-tree-preorder-traversal-in-java-using-recursion-iteration-example.html
    public List<T> preOrder(Node<T> root){
        List<T> returnValues = new ArrayList<T>();

        if (root != null) {
            Stack<Node> nodes = new Stack<>();
            nodes.push(root);

            while (!nodes.isEmpty()) {
                Node<T> current = nodes.pop();
                returnValues.add(current.data);

                if (current.right != null) {
                    nodes.push(current.right);
                }
                if (current.left != null) {
                    nodes.push(current.left);
                }
            }
        }
        System.out.println(returnValues);
        return returnValues;
    }
    public List<T> inOrder(Node<T> root){
        List<T> returnValues = new ArrayList<T>();
        if (root != null) {
            Stack<Node> nodes = new Stack<>();
            Node<T> current = root;

            while (!nodes.isEmpty() || current != null){
                if (current != null) {
                nodes.push(current);
                current = current.left;
                } else {
                    current = nodes.pop();
                    returnValues.add(current.data);
                    current = current.right;
                }
            }
        }
        System.out.println(returnValues);
        return returnValues;
    }

    //https://www.youtube.com/watch?v=qT65HltK2uE
    public List<T> postOrder(Node<T> root){
        List<T> returnValues = new ArrayList<T>();

        if (root != null){
            Stack<Node> tempStack = new Stack<>();
            Stack<Node> finalStack = new Stack<>();

            tempStack.push(root);
            while (!tempStack.isEmpty()) {
                Node<T> current = tempStack.pop();
                finalStack.push(current);

                if (current.left != null){
                    tempStack.push(current.left);
                }
                if (current.right != null){
                    tempStack.push(current.right);
                }
            }

            while (!finalStack.isEmpty()) {
                Node<T> current = finalStack.pop();
                returnValues.add(current.data);
            }

        }
        System.out.println(returnValues);
        return returnValues;
    }

    public static List breadthFirst(BinaryTree treeToTraverse){

        List returnValues = new ArrayList<>();

        if (treeToTraverse.root != null){
            Queue<Node> treeNodeQueue = new Queue<>();
            treeNodeQueue.enqueue(treeToTraverse.root);
            while (!treeNodeQueue.isEmpty()){
                Node current = treeNodeQueue.dequeue();
                if (current.left != null) {
                    treeNodeQueue.enqueue(current.left);
                }
                if (current.right != null) {
                    treeNodeQueue.enqueue(current.right);
                }
                System.out.println(current.data);
                returnValues.add(current.data);
            }
        }
        return returnValues;
    }
}
