package org.example.Tree.contructionTree;

import org.example.Tree.Bfs.Node;
import java.util.HashMap;
import java.util.Map;

class Solution2 {
    int postIndex;
    Map<Integer, Integer> inorderMap;

    public Node buildTree(int[] inorder, int[] postorder) {
        // Start from the last element of postorder
        postIndex = postorder.length - 1;
        inorderMap = new HashMap<>();

        // Map values to indices for quick lookup
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return helper(postorder, 0, inorder.length - 1);
    }

    private Node helper(int[] postorder, int left, int right) {
        // Base case: no elements to form a subtree
        if (left > right) {
            return null;
        }

        // The current root is at postIndex in postorder array
        int rootVal = postorder[postIndex--];
        Node root = new Node(rootVal);

        // Find the index of this root in inorder array
        int index = inorderMap.get(rootVal);

        // Build Right Subtree first (because we're using postIndex from right to left)
        root.right = helper(postorder, index + 1, right);
        
        // Build Left Subtree
        root.left = helper(postorder, left, index - 1);

        return root;
    }
}