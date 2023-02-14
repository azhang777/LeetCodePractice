import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        List<Integer> outputList = new ArrayList<>();
        if (root == null) {
            return null;
        }
        TreeNode current = root;
        while(current != null || !myStack.isEmpty()) {
            while (current != null) {//3now we repeat at the right subtree
                myStack.push(current);
                current = current.left;
            }
            current = myStack.pop(); //1stack will keep popping until a node has a right child
            outputList.add(current.val);
            current = current.right; //2once a node has a right child, go to the right
        }
        return outputList;
    }

    public static void main(String[] args) {
    }
}

/*
        List<Integer> newList = new ArrayList<>();
        if (root == null) {
            return null;
        }
        inorderTraversal(root.left);
        newList.add(root.val);
        inorderTraversal(root.right);
        return newList;
        recursion
 */
