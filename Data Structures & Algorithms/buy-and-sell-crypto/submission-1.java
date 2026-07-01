class Solution {
    public int maxProfit(int[] prices) {
        int low = 0;
        int maxprofit = 0;
        int n = prices.length;

        if(prices.length == 0){
                return 0;
        }

        for(int high=1;high<n;high++){
            if(prices[high]>prices[low]){
                int currprofit = prices[high] - prices[low];

                if(currprofit > maxprofit){
                    maxprofit = currprofit;
                }
            }
            else{
                low = high;
            }
        }
        return maxprofit;
        
    }
}
