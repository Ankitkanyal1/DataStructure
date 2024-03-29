// Approach 1 ==> Recursive Approach not suggested

class Solution {
    public int climbStairs(int n) {
        int ans=recursion(n);
        return ans;
    }
    public int recursion(int n, int qb[]){
        if(n<=1) return 1;
        int a=recursion(n-1);
        int b=recursion(n-2);
        return a+b;  
    }
}

/*Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps*/

// Approach 2 ==> Dynamic Programming Approach 

class Solution {
    public int climbStairs(int n) {
        int ans=recursion(n,new int[n+1]);
        return ans;
    }
    public int recursion(int n, int qb[]){
        if(n<=1) return 1;
        if(qb[n]!=0) return qb[n];
        int a=recursion(n-1,qb);
        int b=recursion(n-2,qb);
        qb[n]=a+b;
        return a+b;  
    }
}

// Dynamic Programming Optimization Approach 
 //Complexity : Time: O(n) ; Space: O(1)
 
class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int prev1 = 1;
        int prev2 = 2;
        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }
        return prev2;
    }
}
