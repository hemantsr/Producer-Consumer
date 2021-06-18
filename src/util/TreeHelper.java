package util;

import model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHelper {
    public static void addElement(final int element,
                                  final TreeNode root) {

        if (root.getValue() == null) {
            root.setValue(element);
            return;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        // Do level order traversal until we find
        // an empty place.
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();

            if (temp.getLeftNode() == null) {
                TreeNode node = new TreeNode();
                node.setValue(element);
                temp.setLeftNode(node);
                break;
            }
            else
                queue.add(temp.getLeftNode());

            if (temp.getRightNode() == null) {
                TreeNode node = new TreeNode();
                node.setValue(element);
                temp.setRightNode(node);
                break;
            }
            else
                queue.add(temp.getRightNode());
        }
    }

    public static void printTree(final TreeNode node) {
        //Todo: Add implementation
    }
}
