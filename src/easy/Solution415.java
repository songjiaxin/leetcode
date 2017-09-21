package easy;

/**
 * Created by lenovo on 2017/9/21.
 */
public class Solution415 {
    public static void main(String args[]){
        String num1 = "98";
        String num2 = "9";
        String result = addStrings(num1, num2);
        System.out.print(result);
    }
    public static String addStrings(String num1, String num2) {
        char[] num1Arr = num1.toCharArray();
        char[] num2Arr = num2.toCharArray();
        int len1 = num1Arr.length;
        int len2 = num2Arr.length;
        int add = 0;
        String result = "";
        for(int i = 0; i < Math.max(len1, len2); i++){
            int index1 = len1 - i - 1;
            int index2 = len2 - i - 1;
            int n1 = 0;
            int n2 = 0;
            if(index1 >= 0){
                n1 = Integer.valueOf(String.valueOf(num1Arr[index1]));
            }
            if(index2 >= 0){
                n2 = Integer.valueOf(String.valueOf(num2Arr[index2]));
            }

            int a = n1 + n2 + add;
            result = a % 10 + result;
            add = a / 10;
        }
        if(add > 0){
            result = add + result;
        }

        return result;
    }
}
