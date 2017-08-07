package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lenovo on 2017/7/29.
 */
public class Solution637 {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static class queueElement {
        TreeNode element;
        int level;
        queueElement(TreeNode element, int level){
            this.element = element;
            this.level = level;
        }
    }
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        Queue<queueElement> queue = new LinkedList<queueElement>();
        if(root != null){
            queue.offer(new queueElement(root, 1));
        }

        int currLevel = 1;
        double sum = 0.0;
        int num = 0;
        while (queue.size() > 0){
            queueElement currElement = queue.poll();
            TreeNode currNode = currElement.element;

            if(currElement.level == currLevel){
                num ++;
                sum += currNode.val;
            }else if(currElement.level > currLevel){
                result.add(sum / num);
                sum = currNode.val;
                num = 1;
                currLevel ++;
            }

            if(currNode.left != null){
                queue.offer(new queueElement(currNode.left, currLevel + 1));
            }
            if(currNode.right != null){
                queue.offer(new queueElement(currNode.right, currLevel + 1));
            }
        }

        if(num > 0){
            result.add(sum / num);
        }

        return result;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Double> result = averageOfLevels(root);
    }
}
