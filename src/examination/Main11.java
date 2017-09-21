package examination;

import java.util.*;

/**
 * Created by lenovo on 2017/9/18.
 * 对每个候选者投票，每票的权重不同，权重和最大的获胜，若和相同，票数最多的获胜
 */
public class Main11 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String vote=scan.nextLine();
        String weight = scan.nextLine();

        String[] voteArr=vote.split(" ");
        int[] voteNum=new int[voteArr.length];

        for(int i=0;i<voteArr.length;i++){
            voteNum[i]=Integer.valueOf(voteArr[i]);
        }

        String[] weightArr=vote.split(" ");
        int[] weightNum=new int[weightArr.length];
        for(int i=0;i<weightArr.length;i++){
            weightNum[i]=Integer.valueOf(weightArr[i]);
        }

        Map<Integer, int[]> map = new HashMap<>();

        for(int i = 0; i <voteNum.length; i++){
            int id = voteNum[i];
            if(map.containsKey(id)){
                int numberSum = map.get(id)[0];
                int weightSum = map.get(id)[1];
                map.put(id, new int[]{numberSum + 1, weightSum + weightNum[i]});
            }else {
                map.put(id, new int[]{1, weightNum[i]});
            }
        }

        int numberSumMax = 0;
        int weightSumMax = 0;
        int id = -1;

        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            int key = (int)entry.getKey();
            int[] value = map.get(key);
            int numberSum = value[0];
            int weightSum = value[1];
            if(weightSum > weightSumMax){
                id = key;
                numberSumMax = numberSum;
                weightSumMax = weightSum;
            }else if(weightSum == weightSumMax && numberSum > numberSumMax){
                id = key;
                numberSumMax = numberSum;
            }
        }

        System.out.println(id);


    }
}
