import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/12.
 */
public class Main3 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int k=scan.nextInt();

        String[] strArr=str.split(" ");
        int[] nums=new int[strArr.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.valueOf(strArr[i]);
        }

        int[] max=new int[k];

        for(int i=0; i<k; i++){
            max[i] = nums[i];
        }

        Arrays.sort(max);
        findMax(nums, max, k);
    }

    private static void findMax(int[] nums, int[] max, int k){
        for(int i=k; i<nums.length; i++){
            if(nums[i] > max[0]){
                int tmp = nums[i];
                nums[i] = max[0];
                max[0] = tmp;
                Arrays.sort(max);
            }

        }
        System.out.println(max[0]);
    }
}
