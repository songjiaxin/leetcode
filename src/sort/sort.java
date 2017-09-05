package sort;

/**
 * Created by lenovo on 2017/7/21.
 */
public class sort {

    public static void main(String args[]){
        int[] a = {1,5,3,2,6,4,5};
        int[] result = mergeSort(0, 6, a);
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

    /**
     * 选择排序
     * @param num
     * @return
     */
    public static int[] selectionSort(int[] num){
        for(int i = 0; i < num.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < num.length; j++){
                if(num[j] < num[min]){
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

    /**
     * 快速排序
     * @param num
     * @return
     */
    public static int[] quickSort(int[] num){
         partion(num, 0, num.length - 1);
         return num;
    }

    public static void partion(int[] num, int low,int high ){
        if(low >= high) return;
        int key = num[low];
        int start = low;
        int end = high;
        while (start < end){
            while (start < end && num[end] > key){
                end--;
            }
            num[start] = num[end];

            while (start < end && num[start] <= key){
                start ++;
            }
            num[end] = num[start];
        }
        num[start] = key;
        partion(num, low, start - 1);
        partion(num, start + 1, high);
    }

    public static int[] mergeSort(int start, int end, int num[]){
        int mid = (start + end) / 2;
        if (start < end){
            mergeSort(start, mid, num);
            mergeSort(mid + 1, end, num);
            merge(start, mid , end, num);
        }

        return num;
    }

    public static void merge(int n1, int n2, int n3, int[] num){
        int[] temp = new int[n3 - n1 + 1];
        int i = n1;
        int j = n2 + 1;
        int k = 0;
        while (i <= n2 && j <= n3){
            if(num[i] <= num[j]){
                temp[k] = num[i];
                i++;
            }else {
                temp[k] = num[j];
                j++;
            }
            k++;
        }

        while (i <= n2){
            temp[k] = num[i];
            i++;
            k++;
        }

        while (j <= n3){
            temp[k] = num[j];
            j++;
            k++;
        }

        k=0;
        for(int p = n1; p <= n3; p++){
            num[p] = temp[k];
            k++;
        }

        return ;
    }


}
