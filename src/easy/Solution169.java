package easy;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/8/17.
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        Arrays.sort(nums);
        int i = 0;
        int sum = 0;
        int key = nums[0];
        while (i < nums.length){
            if(nums[i] == key){
                sum ++;
                if(sum > n){
                    return key;
                }
            }else {
                sum = 1;
                key = nums[i];
            }
            i++;
        }

        return key;
    }

    public int majorityElement2(int[] nums) {
        int key = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                key = nums[i];
                count = 1;
            }else {
                if(nums[i] == key){
                    count ++;
                }else {
                    count --;
                }
            }
        }

        return key;
    }
}
