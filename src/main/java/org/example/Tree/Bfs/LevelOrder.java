package org.example.Tree.Bfs;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    // Also known as Level-Order Traversal. This visits all nodes at the current depth
    // (level) before moving to the next level.
    //
    //Logic: Uses a Queue (FIFO) to keep track of child nodes.
    void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) queue.add(tempNode.left);
            if (tempNode.right != null) queue.add(tempNode.right);
        }
    }
}
