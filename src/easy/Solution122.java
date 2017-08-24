package easy;

/**
 * Created by lenovo on 2017/8/16.
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i + 1] - prices[i] > 0){
                sum += prices[i + 1] - prices[i];
            }
        }

        return sum;
    }
}
