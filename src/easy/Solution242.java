package easy;

/**
 * Created by lenovo on 2017/8/23.
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        int[] charNums = new int[26];
        for(char c : s.toCharArray()){
            charNums[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            charNums[c - 'a']--;
        }

        for(int num : charNums){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
