package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2017/7/28.
 */
public class Solution575 {
    public int distributeCandies(int[] candies) {
        Set<Integer> canSet = new HashSet<Integer>();
        for(int candy : candies){
            canSet.add(candy);
        }
        int diffNum = canSet.size();
        int maxNum = candies.length/2;
        return diffNum > maxNum ? maxNum : diffNum;

    }
}
