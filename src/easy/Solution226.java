package easy;

/**
 * Created by lenovo on 2017/8/7.
 */
public class Solution226 {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }
        TreeNode t = root;
        root.left = invertTree(t.right);
        root.right = invertTree(t.left);
        return root;
    }
}
