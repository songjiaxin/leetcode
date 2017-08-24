package easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by lenovo on 2017/8/13.
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }

        set2.retainAll(set1);
        int[] result = new int[set2.size()];
        Iterator it = set2.iterator();
        int i = 0;
        while (it.hasNext()){
            result[i] = (int)it.next();
            i++;
        }
        return result;
    }
}
