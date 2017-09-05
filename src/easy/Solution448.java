package easy;

import java.util.*;

/**
 * Created by lenovo on 2017/8/8.
 */
public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        if(nums.length == 0) return null;

        Set<Integer> numSet = new HashSet<Integer>();
        for(int num : nums){
            numSet.add(num);
        }

        Set<Integer> result = new HashSet<Integer>();

        for(int i = 1; i <= nums.length; i++){
            result.add(i);
        }

        result.removeAll(numSet);

        List<Integer> resultList = new ArrayList<>(result);
        return resultList;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0){
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String args[]){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers2(nums);
    }
}
