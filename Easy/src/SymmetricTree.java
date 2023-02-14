import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; //if there is nothing to compare besides the root, the root is symmetric to itself.
        }
        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode l, TreeNode r) {
        if (l==null && r==null) {
            return true;
        }
        if (l==null || r==null) {
            return false;
        }
        return (l.val == r.val) && isMirror(l.left,r.right) && isMirror(l.right,r.left);
    }
}
