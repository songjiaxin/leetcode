package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/14.
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        char[] movs = moves.toCharArray();
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        for(char c : movs){
            if(c == 'U'){
                up ++;
            }else if(c == 'D'){
                down ++;
            }else if(c == 'L'){
                left ++;
            }else if(c == 'R'){
                right ++;
            }
        }

        if(up == down && left == right){
            return true;
        }else {
            return false;
        }
    }
}
