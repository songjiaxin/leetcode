package easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by lenovo on 2017/8/1.
 */
public class Solution521 {
    public static void main(String args[]){
        String a = "aaa";
        String b = "aaa";
        int result = findLUSlength(a, b);

    }

    public static int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }


}
