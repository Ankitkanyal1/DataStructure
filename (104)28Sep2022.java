// Approach 1 ==> Using Bitwise Xor || Time Complexity ==> O(N)

class Solution {
    public int[] decode(int[] encoded, int first) {
        int ans[]=new int[encoded.length+1];
        ans[0]=first;
        for(int i=0;i<encoded.length;i++){
            ans[i+1]=ans[i]^encoded[i];
        }
        return ans;
    }
}

/*Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]*/

