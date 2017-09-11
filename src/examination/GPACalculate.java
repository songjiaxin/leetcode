package examination;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/9/11.
 */
public class GPACalculate {
    public static void main(String args[]){
        double[] score ={79, 88, 87, 100, 88, 86, 76, 85, 85, 90, 89};
        double[] credit = {2.0, 1.0, 2.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0};
        double sum = 0;
        double creSun = 0;

        for(int i = 0; i < score.length; i++){
            sum += credit[i] * getPoint(score[i]);
            creSun += credit[i];
        }

        System.out.println(sum / creSun);

    }

    public static double getPoint(double Score){
        if(Score>=90){
            return 4;
        } else if(Score>=85){
            return 3.7;
        } else if(Score>=82){
            return 3.3;
        } else if(Score>=78){
            return 3.0;
        } else if(Score>=75){
            return 2.7;
        } else if(Score>=72){
            return 2.3;
        } else if(Score>=68){
            return 2.0;
        } else if(Score>=66){
            return 1.7;
        } else if(Score>=64){
            return 1.5;
        } else if(Score>=60){
            return 1.0;
        }else {
            return 0.0;
        }
    }
}
