// Approach 1 
// Time complexity ==> O(n)


class Solution {
    public int maxProfit(int[] prices) {
        int max=0,profit=0;
        int min=prices[0];   
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);  
            profit=prices[i]-min;
            max=Math.max(max,profit);
        }
        return max;
        
    }
}


// Approach 2 not recommended Brute force
// Time complexity ==>O(n^2)

class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0,profit=0;
        for(int i=0;i<prices.length-1;i++){
           for(int j=i+1;j<prices.length;j++){
            profit=prices[j]-prices[i];
             if (profit > maxprofit)
                    maxprofit = profit;
           }
        }
        return maxprofit;
        
    }
}
