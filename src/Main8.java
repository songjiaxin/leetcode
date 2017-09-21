import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/13.
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] h = new int[m];
        for(int i = 0; i< m; i++){
            h[i] = sc.nextInt();
        }

        int i = 0;
        int sum1 = 0;
        while (i < m){
            int j = i;
            for(j = i; j < Math.min(i+2, m); j++){
                sum1 += h[j];
            }
            i = j + 1;
        }


        i = 2;
        int sum2 = 0;
        while (i < m){
            int j = i;
            for(j = i; j < Math.min(i+2, m); j++){
                sum2 += h[j];
            }
            i = j + 1;
        }

        if(sum1 > sum2){
            System.out.print("true");
        }else {
            System.out.println("false");
        }


    }
}
