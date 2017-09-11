package easy;

/**
 * Created by lenovo on 2017/9/11.
 */
public class Solution543 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }else {
            int length = getMaxDepth(root.left) + getMaxDepth(root.right);
            if(length > max){
                max = length;
            }
            diameterOfBinaryTree(root.left);
            diameterOfBinaryTree(root.right);
        }

        return max;
    }

    public int getMaxDepth(TreeNode root){
        if(root == null){
            return 0;
        }else {
            int left = 1 + getMaxDepth(root.left);
            int right = 1 + getMaxDepth(root.right);
            return Math.max(left, right);
        }
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public int diameterOfBinaryTree2(TreeNode root) {
        getMaxDepth2(root);
        return max;
    }

    public int getMaxDepth2(TreeNode root){
        if(root == null){
            return 0;
        }else {
            int left = getMaxDepth2(root.left);
            int right = getMaxDepth2(root.right);
            max = Math.max(max, left + right);
            return 1 + Math.max(left,right);
        }
    }
}
