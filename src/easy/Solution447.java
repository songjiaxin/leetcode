package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/8/26.
 */
public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        int sum = 0;
        for(int i = 0; i < points.length; i++){
            double[] distance = new double[points.length - 1];
            int k = 0;
            for(int j = 0; j < points.length; j++){
                if(i == j){
                    continue;
                }else {
                    distance[k] = Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2);
                    k++;
                }
            }

            for(int j = 0; j < points.length - 2; j++){
                for( int m = j + 1; m < points.length - 1; m ++){
                    if(distance[j] == distance[m]){
                        sum += 2;
                    }
                }
            }
        }

        return sum;
    }

    public int numberOfBoomerangs2(int[][] points) {
        int sum = 0;
        for(int i = 0; i < points.length; i++){
            Map<Double, Integer> disMap = new HashMap<Double, Integer>();
            for(int j = 0; j < points.length; j++){
                if(i == j){
                    continue;
                }else {
                    double distance = Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2);
                    disMap.put(distance, disMap.getOrDefault(distance, 0) + 1);
                }
            }

            for(int val : disMap.values()){
                sum += val * (val - 1);
            }


        }

        return sum;
    }

}
