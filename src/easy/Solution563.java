package easy;

/**
 * Created by lenovo on 2017/8/17.
 */
public class Solution563 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        int leftValue = 0;
        int rightValue = 0;

        if(root.left != null){
            leftValue = findSum(root.left);
            sum += findTilt(root.left);
        }
        if(root.right != null){
            rightValue = findSum(root.right);
            sum += findTilt(root.right);
        }

        sum += Math.abs(leftValue - rightValue);
        return sum;
    }

    public int findSum(TreeNode root){
        if(root == null) return 0;
        int sum = root.val;;
        sum += findSum(root.left);
        sum += findSum(root.right);
        return sum;
    }
}
