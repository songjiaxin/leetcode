package sort;

/**
 * Created by lenovo on 2017/9/15.
 */
public class Search {
    static int  num = 0;
    public static void main(String args[]){
        int[] n = {-2, 0, 1, 3, 2, 1};
        System.out.println(kSum(n, 3, 3));
    }

    /**
     * 求数组num中，k个数的和等于target的所有组合数
     * @param n
     * @param k
     * @param target
     * @return
     */
    public static int kSum(int[] n, int k, int target){
        searchKSum(n, 0, k, target, 0);
        return num;
    }

    public static void searchKSum(int[] n, int start, int k, int target, int sum){
        if(k == 0){
            if(sum == target){
                num ++;
            }
            return;
        }

        for(int i = start; i < n.length; i++){
            searchKSum(n, i + 1, k-1, target, sum + n[i]);
        }
    }
}
