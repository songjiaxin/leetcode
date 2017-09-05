import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/12.
 */
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int f = in.nextInt();
        int d = in.nextInt();
        int p = in.nextInt();

        int day = 0;
        if(f >= d/x){
            day = d/x;
        }else {
            day = f + (d - f * x) / (p + x);
        }



        System.out.println(day);
    }

}
