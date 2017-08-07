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
        
        root.left = invertTree(root.right);
        root.right = invertTree(root.left);
        return root;
    }
}
