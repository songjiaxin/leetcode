import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/12.
 */
public class Main2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        while (in.hasNextInt()) {
            A.add(in.nextInt());
        }

        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.size(); i++) {
            if (sum < 0){
                sum = A.get(i);
            }
            else{
                sum += A.get(i);
            }

            if (sum > max){
                max = sum;
            }

        }
        System.out.println(max);

    }
}
