// Approach 1 ==> Recursion 

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n==0) return false;
        if(n%2!=0) return false;
        return isPowerOfTwo(n/2);
    }
}

//Input: n = 16
//Output: true
//Explanation: 24 = 16

// Approach 2 ==> Iterative || Time Complexity ==> O(NLogN)

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n==0) return false;
        if(n<0) return false;
        long i=1;
        while(i<n){
            i=i*2;
        }
        if(i==n) return true;
        return false;
    }
}
