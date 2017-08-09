package easy;

/**
 * Created by lenovo on 2017/8/9.
 */
public class Solution538 {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    private static int  sum = 0;
    public static TreeNode convertBST(TreeNode root) {
        if(root == null) return root;

        convertBST(root.right);
        int val = root.val;
        root.val = root.val + sum;
        sum += val;
        convertBST(root.left);
        return root;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root = convertBST(root);
    }



}
