package easy;

/**
 * Created by lenovo on 2017/8/16.
 */
public class Solution404 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;

        TreeNode leftNode = root.left;
        if(leftNode != null && leftNode.left == null && leftNode.right == null){
            sum += root.left.val;
        }

        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return sum;
    }
}
