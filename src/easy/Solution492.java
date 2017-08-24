package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
public class Solution492 {
    public int[] constructRectangle(int area) {
        List<Integer> num = new ArrayList<Integer>();
        for(int i = 1; i <= area; i++){
            if(area % i == 0){
                num.add(i);
            }
        }

        int[] result = new int[2];
        int len = num.size();
        if(len % 2 == 0){
            result[0] = num.get(len/2);
            result[1] = num.get(len/2 - 1);
        }else {
            result[0] = num.get(len / 2);
            result[1] = num.get(len / 2);
        }

        return result;
    }
    public int[] constructRectangle2(int area) {
        int[] result = new int[2];
        if(area == 0) return result;
        int width = (int) Math.sqrt(area);
        for(int i = width; i > 0; i--){
            if(area % i == 0){
                width = i;
                break;
            }
        }
        int length = area / width;
        result[0] = length;
        result[1] = width;
        return result;
    }

}
