// Approach 1 ==> Lookup Table - 32 bit signed integers only || Time Complexity ==> O(1) || Space Complexity ==> O(1)

class Solution {
    int[] fib_nums = {
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
            6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040,
            1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986,
            102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903
    };

    public int fib(int n) {
        return fib_nums[n];
    }
}

//Input: n = 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

// Approach 2 ==> Using Recursion 

class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}

// Approach 3 ==> Using Dynamic Programming

class Solution {
    public int fib(int n) {
       return dp(n,new int[n+1]);
    }
    public int dp(int n, int[] qb){
        if(n==1 || n==0) return n;
        if(qb[n]!=0) return qb[n];
        int fib1=dp(n-1, qb);
        int fib2=dp(n-2, qb);
        int sum=fib1+fib2;
        qb[n]=sum;
        return sum;
    }
}
