package easy;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/9/10.
 */
public class Soluiton674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = 0;
        int con = 0;
        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i + 1] > nums[i] ){
                con++;
            }else {
                if(con > max){
                    max = con;
                }
                con = 0;
            }
        }
        if(con > max){
            max = con;
        }


        return max + 1;
    }
}
