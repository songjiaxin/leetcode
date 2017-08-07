package easy;

/**
 * Created by lenovo on 2017/7/27.
 */
public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int size = nums.length * nums[0].length;
        if(size != r * c){
            return nums;
        }

        int[] numArr = new int[size];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                numArr[k] = nums[i][j];
                k++;
            }
        }

        int[][] newMatrix = new int[r][c];
        k = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                newMatrix[i][j] = numArr[k];
                k++;
            }
        }

        return newMatrix;
    }
}
