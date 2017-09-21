package easy;

/**
 * Created by lenovo on 2017/9/15.
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }

        return constructBST(nums, 0, nums.length - 1);
    }

    public TreeNode constructBST(int[] nums, int m, int n){
        if(m > n){
            return null;
        }
        int mid = (m + n) / 2;
        TreeNode parent = new TreeNode(nums[mid]);
        parent.left = constructBST(nums, m, mid - 1);
        parent.right = constructBST(nums, mid + 1, n);
        return parent;
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
