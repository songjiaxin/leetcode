package easy;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/8/27.
 */
public class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max1 = nums[nums.length - 1];
        int max2 = nums[nums.length - 2];
        int max3 = nums[nums.length - 3];
        int min1 = nums[0];
        int min2 = nums[1];

        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }
}