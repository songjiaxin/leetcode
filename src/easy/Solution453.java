package easy;

/**
 * Created by lenovo on 2017/8/12.
 */
public class Solution453 {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }

        int sum = 0;
        for(int num : nums){
            sum += (num - min);
        }

        return sum;
    }
}
