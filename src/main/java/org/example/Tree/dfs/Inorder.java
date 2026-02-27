package org.example.Tree.dfs;

public class Inorder {

    //Commonly used in Binary Search Trees (BST) because it visits nodes in ascending order.
    void printInorder(Node node){
        if(node==null) return;
        printInorder(node.left);
        System.out.println(node.data);
        printInorder(node.right);
    }
}
