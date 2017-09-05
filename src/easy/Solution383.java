package easy;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/8/13.
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        Arrays.sort(ran);
        Arrays.sort(mag);

        int index = 0;
        for(int i = 0; i < ran.length; i++){
            boolean flag = false;
            while (index < mag.length){
                if(mag[index] == ran[i]){
                    flag = true;
                    index ++;
                    break;
                }else {
                    index++;
                }
            }

            if(!flag){
                return false;
            }
        }

        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] charNum = new int[26];
        for(char c : magazine.toCharArray()){
            charNum[c - 'a'] ++;
        }

        for(char c : ransomNote.toCharArray()){
            charNum[c - 'a'] --;
            if(charNum[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
