package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(index < i){
                    index = i;
                }

                for(int j = index + 1; j < nums.length; j++){
                    if(nums[j] != 0){
                        index = j;
                        break;
                    }
                }

                if(index == i){
                    return;
                }else {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
            }

        }
    }

    public void moveZeroes2(int[] nums) {
        int index = 0;
        for(int num : nums){
            if(num != 0){
                nums[index] = num;
                index++;
            }
        }

        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
