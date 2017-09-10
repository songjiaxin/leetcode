package easy;

/**
 * Created by lenovo on 2017/9/10.
 */
public class Solution504 {
    public String convertToBase7(int num) {
        boolean isNegative = false;
        if(num == 0){
            return "0";
        }
        if(num < 0){
            isNegative = true;
            num = - num;
        }
        String str = "";
        while (num > 0){
            int a = num % 7;
            num = num / 7;
            str = a + str;
        }
        if(isNegative){
            str = "-" + str;
        }
        return str;
    }
}
