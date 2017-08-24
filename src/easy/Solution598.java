package easy;

/**
 * Created by lenovo on 2017/8/12.
 */
public class Solution598 {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0) return m * n;
        int a = m;
        int b = n;
        for(int i = 0 ; i < ops.length; i++){
            if(ops[i][0] < a){
                a = ops[i][0];
            }
            if(ops[i][1] < b){
                b = ops[i][1];
            }
        }

        return a * b;
    }
}
