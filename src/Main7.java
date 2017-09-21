import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/13.
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = Math.max(a, b); i <= n; i++){
            if(i % a == 0 && i % b == 0){
                sum ++;
            }
        }
        System.out.println(sum);
    }




}
