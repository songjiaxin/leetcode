package easy;

/**
 * Created by lenovo on 2017/9/12.
 */
public class Solution551 {
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'A'){
                num1++;
                num2 = 0;
            }else if(arr[i] == 'L'){
                num2++;
            }else {
                num2 = 0;
            }

            if(num1 > 1 || num2 > 2){
                return false;
            }
        }

        return true;
    }
}
