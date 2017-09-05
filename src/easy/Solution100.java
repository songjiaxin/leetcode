package easy;

import sun.reflect.generics.tree.Tree;

/**
 * Created by lenovo on 2017/8/23.
 */
public class Solution100 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }

        if((p == null && q != null) || (p != null && q == null) ){
            return false;
        }
        boolean parentEqual = isEqual(p, q);
        boolean leftEqual = isSameTree(p.left, q.left);
        boolean rightEqual = isSameTree(p.right, q.right);
        if(parentEqual && leftEqual && rightEqual){
            return true;
        }
        return false;
    }

    public boolean isEqual(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }

        if(p != null && q != null && p.val == q.val){
            return true;
        }

        return false;
    }
}
