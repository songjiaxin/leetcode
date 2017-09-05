package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/14.
 */
public class Solution530 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public int getMinimumDifference(TreeNode root) {
        List<Integer> numList = new ArrayList<Integer>();
        traverse(root, numList);
        if(numList.size() < 2) return -1;
        int min = numList.get(1) - numList.get(0);
        for(int i = 0; i < numList.size() - 1; i++){
            if(numList.get(i + 1) - numList.get(i) < min){
                min = numList.get(i + 1) - numList.get(i);
            }
        }
        return min;
    }

    public void traverse(TreeNode root , List<Integer> numList){
        if (root == null) return;
        traverse(root.left, numList);
        numList.add(root.val);
        traverse(root.right, numList);
    }
}
