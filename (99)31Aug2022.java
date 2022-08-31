// Approach 1 ==> Using Dynamic Programming || Time Complexity ==> O(N)

class Solution {
    public int tribonacci(int n) {
        if(n==0||n==1) return n;
        int[] dp=new int[n+1];
        dp[0]=0;dp[1]=1;dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}

/*Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4*/
