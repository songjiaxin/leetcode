package easy;

import java.util.*;

/**
 * Created by lenovo on 2017/8/16.
 */
public class Solution599 {
    public static void main(String args[]){
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] result = findRestaurant(list1, list2);
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> restaurant = new ArrayList<>();

        int min = list1.length + list2.length;
        for(int i = 0; i < list1.length; i ++){
            for(int j = 0; j < list2.length; j ++){
                if(list1[i].equals(list2[j])){
                    if(i + j == min){
                        restaurant.add(list1[i]);
                    }else if(i + j < min){
                        min = i + j;
                        restaurant.clear();
                        restaurant.add(list1[i]);
                    }
                }
            }
        }

        return restaurant.toArray(new String[restaurant.size()]);

    }
}
