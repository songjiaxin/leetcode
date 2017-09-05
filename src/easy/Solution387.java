package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/8/18.
 */
public class Solution387 {
    public int firstUniqChar(String s) {
        if(s == null || s.isEmpty()) return -1;
        char[] charArr = s.toCharArray();
        int[] nums = new int[26];


        for(char c : charArr){
            nums[c - 'a'] ++;
        }

        for(int i = 0; i < charArr.length; i++){
            if(nums[charArr[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
