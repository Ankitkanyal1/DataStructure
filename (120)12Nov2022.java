// Appraoch 1 ==> Time Complexity ==> O(nlogn)

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length-2;
        int sum=0;
        for(int i=0;i<piles.length/3;i++){
            sum+=piles[n];
            n=n-2;
        }
        return sum;
    }
}

/* Input: piles = [2,4,1,2,7,8]
Output: 9
Explanation: Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the last one.
Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.
The maximum number of coins which you can have are: 7 + 2 = 9.
On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.*/

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0;
        for(int i=piles.length/3;i<piles.length;i+=2){
            sum+=piles[i];
        }
        return sum;
    }
}
