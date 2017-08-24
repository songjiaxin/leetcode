package easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by lenovo on 2017/8/10.
 */
public class Solution389 {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0) return t.toCharArray()[0];
        char[] sArr = s.toCharArray();
        char result = sArr[0];
        for(int i = 1; i < sArr.length; i++){
            int r = result ^ sArr[i];
            result =  (char) r;
        }

        for(char tChar : t.toCharArray()){
            int r = result ^ tChar;
            result =  (char) r;
        }

        return result;
    }
}
