package easy;

/**
 * Created by lenovo on 2017/9/15.
 */
public class Solution671 {
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null || root.left == null){
            return -1;
        }

        int min = root.val;
        return  search(root, min);
    }

    public int search(TreeNode node, int min){
        if(node == null){
            return -1;
        }

        if(node.val > min){
            return node.val;
        }

        int left = search(node.left, min);
        int right = search(node.right, min);

        if(left > -1 && right > -1){
            return Math.min(left, right);
        }else if(left > -1){
            return left;
        }else if(right > -1){
            return right;
        }

        return -1;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
