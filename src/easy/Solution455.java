package easy;

import java.util.Arrays;

/**
 * Created by lenovo on 2017/8/15.
 */
public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        int result = 0;
        for(int gEle : g){
            if(index >= s.length) return result;
            while (index < s.length){
                if(gEle <= s[index]){
                    result ++;
                    index ++;
                    break;
                }else {
                    index ++;
                }
            }
        }

        return result;
    }
}
