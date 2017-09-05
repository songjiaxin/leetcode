package easy;

/**
 * Created by lenovo on 2017/8/8.
 */
public class Solution371 {
    public int getSum(int a, int b) {
        int c = a ^ b;
        int d = a & b;

        if(d != 0){
            c = getSum(c, d << 1);
        }

        return c;
    }
}
