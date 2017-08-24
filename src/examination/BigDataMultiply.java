package examination;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 * 两个大数相乘
 */
public class BigDataMultiply {
    public static void main(String args[]){
        String str1 = "12";
        String str2 = "33";
        multiply(str1, str2);
    }

    public static void multiply(String str1, String str2){
        if(str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()){
            System.out.println("数字不能为空");
        }
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i <= ((str1Arr.length - 1) + (str2Arr.length - 1)); i++){
            result.add(0);
        }

        // 从高位到低位逐位相乘
        for(int i = 0; i < str1Arr.length; i++){
            for(int j = 0; j < str2Arr.length; j ++){
                int temp = result.get(i + j) + Integer.parseInt(String.valueOf(str1Arr[i])) * Integer.parseInt(String.valueOf(str2Arr[j]));
                result.set(i + j, temp);
            }
        }

        for(int i = result.size() - 1; i >= 0; i--){
            int a = result.get(i) / 10;
            int b = result.get(i) % 10;
            if(a > 0){
                result.set(i, b);
                int temp = result.get(i + 1);
                result.set(i - 1, temp + a);
            }
        }

        System.out.println("乘积：");
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i));
        }

    }
}
