package easy;

/**
 * Created by lenovo on 2017/9/12.
 */
public class Solution541 {
    public static void main(String args[]){
        String input = "abcdefg";
        System.out.println(reverseStr(input, 8));
    }
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        char[] newArr = new char[arr.length];
        int i = 0;
        while (i < arr.length){
            if(i / k % 2 == 0){
                int j = k - i - 1 + 2 * (i / k) * k;
                if(i / k * k + k > arr.length - 1){
                    j = arr.length - 1 - (i - (i / k) * k);
                }

                newArr[i] = arr[j];
            }else {
                newArr[i] = arr[i];
            }
            i++;
        }

        String result = "";
        for(char c : newArr){
            result += c;
        }

        return result;
    }


    public static String reverseStr2(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        while (i < arr.length){
            int j = Math.min(i + k - 1, arr.length - 1);
            swap(arr, i, j);
            i = i + 2 * k;
        }

        return String.valueOf(arr);
    }

    public static void swap(char[] arr, int m, int n){
        while (m < n){
            char temp = arr[m];
            arr[m] = arr[n];
            arr[n] = temp;
            m++;
            n--;
        }
    }


}
