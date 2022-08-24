// Approach 1 ==> Recursive 

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n<=0) return false;
        if(n%3!=0) return false;
        return isPowerOfThree(n/3);
    }
}

//Input: n = 27
//Output: true

// Approach 2 ==> Iterative 

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n<=0) return false;
        long i=1;
        while(i<n){
            i=i*3;
        }
        if(i==n) return true;
        return false;
    }
}

// Approach 3 

public class Solution {
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
