package easy;

/**
 * Created by lenovo on 2017/8/22.
 */
public class Solution661 {
    public int[][] imageSmoother(int[][] M){
        int row = M.length;
        int col = M[0].length;
        int[][] result = new int[row][col];
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[0].length; j++){
                int sum = 0;
                int num = 0;
                if((i - 1) >=0){
                    if((j - 1) >=0 ){
                        sum += M[i - 1][j -1];
                        num ++;
                    }
                    sum += M[i - 1][j];
                    num ++;
                    if((j + 1) < col){
                        sum += M[i - 1][j + 1];
                        num ++;
                    }
                }

                if((j - 1) >=0 ){
                    sum += M[i][j -1];
                    num ++;
                }
                sum += M[i][j];
                num ++;
                if((j + 1) < col){
                    sum += M[i][j + 1];
                    num ++;
                }

                if((i + 1) < row){
                    if((j - 1) >=0 ){
                        sum += M[i + 1][j -1];
                        num ++;
                    }
                    sum += M[i + 1][j];
                    num ++;
                    if((j + 1) < col){
                        sum += M[i + 1][j + 1];
                        num ++;
                    }
                }

                result[i][j] = sum / num;

            }
        }

        return result;
    }
}
