package org.example.Tree.dfs;

public class PostOrder {

    // Commonly used to delete a tree or evaluate postfix (Reverse Polish) expressions.
    void printPostOrder(Node node){
        if (node==null) return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.data);

    }
}
