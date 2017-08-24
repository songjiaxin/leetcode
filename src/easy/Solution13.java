package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/8/24.
 */
public class Solution13 {
    public int romanToInt(String s) {
        Map<Character, Integer> numMap = new HashMap<Character, Integer>();
        numMap.put('I', 1);
        numMap.put('V', 5);
        numMap.put('X', 10);
        numMap.put('L', 50);
        numMap.put('C', 100);
        numMap.put('D', 500);
        numMap.put('M', 1000);

        char[] roman = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < roman.length; i++){
            if( i + 1 < roman.length && numMap.get(roman[i]) < numMap.get(roman[i + 1])){
                sum += numMap.get(roman[i + 1]) - numMap.get(roman[i]);
                i++;
            }else {
                sum += numMap.get(roman[i]);
            }
        }

        return sum;
    }
}
