import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i == j ){
                    if(num[i] == 0){
                        left.add(i);
                        right.add(i);
                        break;
                    }
                }else {
                    int s = 0;
                    for(int k = i; k <= j; k++){
                        s = s ^ num[k];
                    }
                    if(s == 0){
                        left.add(i);
                        right.add(j);
                        break;
                    }
                }
            }
        }

        int result = left.size();

        for(int i = 0; i < left.size() - 1; i++){
            if(left.get(i + 1) <= right.get(i)){
                result --;
                i++;
            }
        }

        System.out.println(result);
    }
}