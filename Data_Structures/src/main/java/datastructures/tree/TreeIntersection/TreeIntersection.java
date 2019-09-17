package datastructures.tree.TreeIntersection;

import datastructures.hashtable.HashTable;
import datastructures.stacksandqueues.Stack;
import datastructures.tree.BinaryTree;
import datastructures.tree.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

    public static List tree_intersection1(BinaryTree tree1, BinaryTree tree2){

        List returnValues = new ArrayList();
        HashTable newTable = new HashTable();
        List tree1Values = tree1.inOrder(tree1.getRoot());
        List tree2Values = tree2.inOrder(tree2.getRoot());

        for (int i = 0; i < tree1Values.size(); i++){
            newTable.add(tree1Values.get(i).toString(), false);
        }

        for (int j = 0; j < tree2Values.size(); j++){
            if (newTable.contains(tree2Values.get(j).toString())){
                returnValues.add(tree2Values.get(j));
            }
        }
        return returnValues;

    }
}

