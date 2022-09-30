// Approach 1 ==> Time Complexity ==> O(N)

class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=start+2*i;
            xor=xor^ans[i];
        }
        return xor;
    }
}

/*Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.*/

// Approach 2 ==> Time Complexity ==> O(N) || Space Complexity ==> O(1)

class Solution {
    public int xorOperation(int n, int start) {
        int xor=start;
        for(int i=1;i<n;i++){
            xor=xor^(start+2*i);
        }
        return xor;
    }
}
