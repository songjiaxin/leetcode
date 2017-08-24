package easy;

/**
 * Created by lenovo on 2017/8/14.
 */
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] result = new int[2];
        while (i < j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            }else if(sum > target){
                j --;
            }else {
                i ++;
            }
        }

        return result;
    }
}
