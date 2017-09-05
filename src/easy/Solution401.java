package easy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/8/27.
 */
public class Solution401 {
    public static void main(String args[]){
        List<String> result = readBinaryWatch(2);
    }
    public static List<String> readBinaryWatch(int num) {
        int[] time = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[num];
        return combine(time, num, result, 0, 0);
    }

    public static List<String> combine(int[] time, int num, int[] result, int begin, int index){
        List<String> timeResult = new ArrayList<>();
        if(num == 0){
            int hour = 0;
            int minute = 0;
            for(int t : result){
                if(t < 4){
                    hour += Math.pow(2, t);
                }else {
                    minute += Math.pow(2, t - 4);
                }
            }

            if(hour >= 12 || minute > 59){
                return timeResult;
            }

            String timeStr = "" + hour + ":";
            if(minute < 10){
                timeStr += "0";
            }
            timeStr += minute;
            timeResult.add(timeStr);
            return timeResult;
        }

        for(int i = begin; i < time.length; i++){
            result[index] = time[i];
            timeResult.addAll(combine(time, num- 1, result, i + 1, index + 1));
        }

        return timeResult;
    }

    public  List<String> readBinaryWatch2(int num) {
        List<String> result = new ArrayList<>();
        for(int h = 0; h < 12; h++){
            for(int m = 0; m < 60; m++){
                int time = h * 64 + m;
                if(Integer.bitCount(time) == num){
                    result.add(String.format("%d:%02d", h, m));
                }
            }
        }

        return result;
    }
}
