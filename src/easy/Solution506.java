package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * Created by lenovo on 2017/8/20.
 */
public class Solution506 {
    public static void main(String args[]){
        int[] nums = new int[]{10, 3 , 8 , 9, 4};
        String[] rank =findRelativeRanks(nums);
    }
    public static String[] findRelativeRanks(int[] nums) {
        String[] rank = new String[nums.length];
        if(nums == null || nums.length == 0) return rank;
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            indexMap.put(nums[i], i);
        }
        fastSort(0, nums.length - 1, nums);
        if(nums.length >= 1){
            int index = indexMap.get(nums[0]);
            rank[index] = "Gold Medal";
        }

        if(nums.length >= 2){
            int index = indexMap.get(nums[1]);
            rank[index] = "Silver Medal";
        }

        if(nums.length >= 3){
            int index = indexMap.get(nums[2]);
            rank[index] = "Bronze Medal";
        }

        for(int i = 3; i < nums.length; i++){
            int index = indexMap.get(nums[i]);
            rank[index] = i + 1 + "";
        }

        return rank;

    }

    public static void fastSort(int start, int end, int[] nums){
        if(start >= end) return;
        int low = start;
        int high = end;
        int key = nums[low];
        while (low < high){
            while (low < high && nums[high] < key){
                high --;
            }
            nums[low] = nums[high];
            while (low < high &&nums[low] >= key){
                low ++;
            }
            nums[high] = nums[low];
        }
        nums[low] = key;
        fastSort(start, low - 1, nums);
        fastSort(low + 1, end, nums);
    }
}
