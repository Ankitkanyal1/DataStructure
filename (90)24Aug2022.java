// Approach 1 ==> Recursive 

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n==0) return false;
        if(n%4!=0) return false;
        return isPowerOfFour(n/4);
    }
}

//Input: n = 5
//Output: false

// Approach 2 ==> Iterative 

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n==0) return false;
        if(n<0) return false;
        long i=1;
        while(i<n){
            i=i*4;
        }
        if(i==n) return true;
        return false;
    }
}

// Approach 3

public boolean isPowerOfFour(int n) {
       if(n<=0) return false;
       if((n&(n-1))!=0) return false;
        return (n-1)%3==0;
    }
