package org.example.Tree.contructionTree;

import org.example.Tree.Bfs.Node;

import java.util.HashMap;
import java.util.Map;

//reconstruct a unique binary tree using the specific properties of Pre-Order and In-Order traversals
class Solution {
    int preorderIndex;
    Map<Integer, Integer> inorderIndexMap;

    public Node buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();
        
        // Build a map to find the index of a value in inorder array quickly
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return arrayToTree(preorder, 0, inorder.length - 1);
    }

    private Node arrayToTree(int[] preorder, int left, int right) {
        // If there are no elements to construct the tree
        if (left > right) return null;

        // Select the preorderIndex element as the root and increment it
        int rootValue = preorder[preorderIndex++];
        Node root = new Node(rootValue);

        // Build left and right subtree
        // excluding inorderIndexMap[rootValue] element because it's the root
        int mid = inorderIndexMap.get(rootValue);
        
        root.left = arrayToTree(preorder, left, mid - 1);
        root.right = arrayToTree(preorder, mid + 1, right);

        return root;
    }
}