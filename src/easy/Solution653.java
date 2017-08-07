package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/7.
 */
public class Solution653 {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    private static List<Integer> nums = new ArrayList<Integer>();
    public static boolean findTarget(TreeNode root, int k) {
        traverse(root);
        if (nums.size() < 2) {
            return false;
        }

        int i = 0;
        int j = nums.size() - 1;
        while (i < j){
            int sum = nums.get(i) + nums.get(j);
            if(sum == k){
                return true;
            }else if (sum < k){
                i ++;
            }else {
                j --;
            }
        }
        return false;
    }

    public static void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.left);
        nums.add(root.val);
        traverse(root.right);
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(-3);
        root.right.right = new TreeNode(4);
        boolean result = findTarget(root, -4);
        System.out.println(result);
    }

}
