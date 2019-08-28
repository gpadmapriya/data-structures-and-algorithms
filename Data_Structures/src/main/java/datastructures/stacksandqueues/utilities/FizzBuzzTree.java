package datastructures.stacksandqueues.utilities;

import datastructures.stacksandqueues.Stack;
import datastructures.tree.BinaryTree;
import datastructures.tree.Node;

public class FizzBuzzTree {
    public static BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> fizzbuzztree){
        Node<Object> root = fizzbuzztree.getRoot();
        if (root != null){
            Stack<Node> nodes = new Stack<>();
            nodes.push(root);

            while (!nodes.isEmpty()) {
                Node<Object> current = nodes.pop();
                if ((int)current.getData() % 15 == 0){
                    current.setData("FizzBuzz");
                } else if ((int)current.getData() % 3 == 0) {
                    current.setData("Fizz");
                } else if ((int)current.getData() % 5 == 0){
                    current.setData("Buzz");
                }

                if (current.getRight() != null) {
                    nodes.push(current.getRight());
                }
                if (current.getLeft() != null) {
                    nodes.push(current.getLeft());
                }
            }
        }
        return fizzbuzztree;
    }

}
