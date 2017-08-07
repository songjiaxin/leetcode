package easy;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/8/3.
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = nums[0];
        for(int i = 0; i < nums.length; i = i+2){
            if(i < nums.length - 1){
                if(nums[i] != nums[i+1]){
                    result = nums[i];
                    break;
                }
            }else {
                result = nums[nums.length - 1];
            }
        }

        return result;
    }

    public int singleNumber2(int[] nums) {
        int result = 0;
        for(int num : nums){
            result = result ^ num;
        }
        return result;
    }
}
