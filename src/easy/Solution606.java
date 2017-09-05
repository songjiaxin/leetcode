package easy;

/**
 * Created by lenovo on 2017/8/10.
 */
public class Solution606 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }



    public String tree2str(TreeNode t) {
        String result = "";
        if(t == null) return "";
        result += t.val;
        if(t.left != null){
            result += "(" + tree2str(t.left) + ")";
        }else if(t.left == null && t.right != null){
            result += "()";
        }

        if(t.right != null){
            result += "(" + tree2str(t.right) + ")";
        }

        return result;
    }
}
