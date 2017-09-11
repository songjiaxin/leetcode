package easy;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/9/11.
 */
public class Solution268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != j){
                return j;
            }
            j++;
        }
        return j;
    }
}
