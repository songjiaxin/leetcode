package easy;

/**
 * Created by lenovo on 2017/8/3.
 */
public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(curr > max){
                    max = curr;
                }
                curr = 0;
            }else {
                curr ++;
            }
        }
        if(curr > max){
            max = curr;
        }

        return max;
    }
}
