import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/17.
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <= 0){
            System.out.println(1);
            return;
        }

        List<employee> eList = new ArrayList<>();
        eList.add(new employee(false, 0));
        for(int i = 0; i < a; i++){
            int addnum = 0;
            for(int j = 0; j < eList.size(); j++){
                employee curr = eList.get(j);


                if(curr.flag == false)
                {
                    if(curr.testTime + 1 < 3){
                        eList.set(j, new employee(false, curr.testTime + 1));
                    }else {
                        eList.set(j, new employee(true, 3));
                    }
                }

                if(curr.flag == true){
                    addnum = addnum + 1;
                }
            }

            for(int k = 0; k < addnum; k++){
                eList.add(new employee(false, 0));
            }
        }
        System.out.println(eList.size());
    }
}

class employee{
    boolean flag ;
    int testTime ;
    public employee(boolean f, int t){
        flag = f;
        testTime = t;
    }
}
