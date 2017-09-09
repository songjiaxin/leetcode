package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lenovo on 2017/9/9.
 */
public class Solution350 {
    public static void main(String args[]){
        int[] num1 = {3,1,2};
        int[] num2 = {1,3};
        int[] result = intersect(num1, num2);

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<Integer>();
        int j = 0;
        for(int i = 0; i < nums1.length; i++){
            if(j >= nums2.length){
                break;
            }
            int key = nums1[i];
            while ( j < nums2.length && key >= nums2[j]){
                if(key > nums2[j]){
                    j++;
                }else if(key == nums2[j]){
                    result.add(key);
                    j++;
                    break;
                }
            }

        }

        int[] resultArr = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }


    public static int[] intersect2(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] resultArr = new int[result.size()];
        for(int m = 0; m < result.size(); m++){
            resultArr[m] = result.get(m);
        }
        return resultArr;
    }


}
