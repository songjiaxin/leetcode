import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/10.
 */
public class Main5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println(0);
        }
        int[] result = new int[n];
        result[0] = 1;
        int M2 = 0;
        int M3 = 0;
        int M5 = 0;
        for (int i = 1; i < n; i++) {

            int min = min(result[M2] * 2, result[M3] * 3, result[M5] * 5);
            result[i] = min;
            if (result[M2] * 2 <= min)
                M2++;
            if (result[M3] * 3 <= min)
                M3++;
            if (result[M5] * 5 <= min)
                M5++;

        }
        System.out.println(result[n - 1]);
    }


    public static int min(int a, int b, int c) {
        int min = (a < b) ? a : b;
        return (min < c) ? min : c;
    }
}