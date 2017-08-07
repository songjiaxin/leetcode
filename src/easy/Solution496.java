package easy;

/**
 * Created by lenovo on 2017/7/30.
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result = new int[findNums.length];
        for(int i = 0; i < findNums.length; i++){
            result[i] = -1;
            int k = -1;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == findNums[i]){
                    k = j;
                    break;
                }
            }

            if(k >=0 && k < nums.length -1){
                for(int j = k; j < nums.length; j++){
                    if(nums[j] > findNums[i]){
                        result[i] = nums[j];
                        break;
                    }
                }
            }
        }
        return result;
    }
}
