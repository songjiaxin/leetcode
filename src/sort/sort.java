package sort;

/**
 * Created by lenovo on 2017/7/21.
 */
public class sort {
    public static void main(String args[]){
        int[] a = {1,5,3,2,6,4,5};
        int[] result = bubbleSort(a);
    }

    /**
     * 插入排序
     * @param num
     * @return
     */
    public static int[] insertionSort(int[] num){
        for(int i = 1; i < num.length; i++){
            int curr = num[i];
            int j = i -1;
            while (curr < num[j] && j >=0){
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = curr;
        }
        return num;
    }

    /**
     * 冒泡排序
     * @param num
     * @return
     */
    public static int[] bubbleSort(int[] num){
        for(int i = 0; i < num.length - 1; i++){
            for(int j = 0; j < num.length - i - 1; j++){
                if(num[j + 1] < num[j]){
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }

    public static int[] selectionSort(int[] num){
        for(int i = 0; i < num.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < num.length; j++){
                if(num[j] < num[i]){
                    min = j;
                }
            }
            if(i != min){
                int temp = num[i];
                num[i] = num[min];
                num[min] = temp;
            }
        }
        return num;
    }
}
