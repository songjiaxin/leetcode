package easy;

/**
 * Created by lenovo on 2017/8/9.
 */
public class Solution258 {
    public int addDigits(int num) {
        int result = num;
        while (result > 9){
            int a = result;
            result = 0;
            while (a > 0){
                int b = a % 10;
                a = a / 10;
                result += b;
            }
        }
        return result;
    }

    public int addDigits2(int num) {
        return num == 0 ? 0 : (num % 9) == 0 ? 9 : num % 9;
    }



}
