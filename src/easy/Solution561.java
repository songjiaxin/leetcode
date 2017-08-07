package easy;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/7/24.
 */
public class Solution561 {
    public static void main(String args[]){
        int[] nums = {7,3,1,0,0,6};
        int result = arrayPairSum(nums);
        System.out.println(result);
    }
    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            sum += nums[i];
        }

        return sum;
    }


}
