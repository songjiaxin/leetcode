package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2017/8/24.
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        Set<Integer> numSet = new HashSet<Integer>();
        for(int num : nums){
            numSet.add(num);
        }

        if(nums.length != numSet.size()){
            return true;
        }

        return false;
    }
}
