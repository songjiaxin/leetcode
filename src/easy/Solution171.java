package easy;

/**
 * Created by lenovo on 2017/8/15.
 */
public class Solution171 {
    public int titleToNumber(String s) {
        if(s == null || s.isEmpty()) return -1;
        char[] charArr = s.toCharArray();
        int len = charArr.length;
        int result = 0;
        for(int i = 0; i < len; i++){
            int sig = single(charArr[i]);
            if(sig == -1) return -1;
            result += sig * Math.pow(26, len - i - 1);
        }
        return result;
    }

    public int single(char c){
        if(c >= 'A' && c <= 'z'){
            return (c - 'A' + 1);
        }else {
            return -1;
        }
    }
}
