package examination;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/10.
 * x repeat k次 比较大小
 */
public class Main7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int k1 = sc.nextInt();
        int x2 = sc.nextInt();
        int k2 = sc.nextInt();
        String str1 = "" + x1;
        int len1 = str1.length();
        String str2 = "" + x2;
        int len2 = str2.length();
        int total1 = len1 * k1;
        int total2 = len2 * k2;
        if(total1 < total2){
            System.out.println("Less");
        }else if(total1 > total2){
            System.out.println("Greater");
        }else {
            int[] arr1 = getArr(x1, len1);
            int[] arr2 = getArr(x2, len2);
            int n = getMax(len1, len2);
            int i = 0;
            while (i < n && i < total1){
                if(arr1[i % len1] > arr2[i % len2]){
                    System.out.println("Greater");
                    return;
                }else if(arr1[i % len1] < arr2[i % len2]){
                    System.out.println("Less");
                    return;
                }
                i++;
            }
            System.out.println("Equal");
        }

    }

    public static int getMax(int a, int b){
        int out = a* b;
        int m = a % b;
        while (m != 0){
            a = b;
            b = m;
            m = a% b;
        }
        return out / b;
    }

    public static int[] getArr(int x, int len){
        int[] arr = new int[len];
        int i = len - 1;
        while (x > 0){
            arr[i] = x % 10;
            x = x / 10;
            i--;
        }
        return arr;
    }

}
