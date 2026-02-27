package org.example.Tree.dfs;

public class Preorder {

    //Useful for creating a copy of the tree or prefix expressions.
    void printPreorder(Node node){
        if(node==null) return;
        System.out.println(node.data);
        printPreorder(node.left);
        printPreorder(node.right);
    }
}
