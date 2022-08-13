// Approach 1 ==> Sliding window || Time Complexity ==> O(N)

class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s=Integer.toString(num);// String s= String.valueOf(num);
        for(int i=0;i<s.length()-k+1;i++){
            String temp=s.substring(i,i+k);
            int x=Integer.parseInt(temp); // int x=Integer.valueOf(temp);
            if(x==0)continue;
            if(num%x==0)count++;
        }
        return count;
    }
}

Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.
