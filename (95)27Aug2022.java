// Approach 1 ==> Recursive approach 

class Solution {
    public char findKthBit(int n, int k) {
        String s=findString(n);
        return s.charAt(k-1);
    }
    public static String findString(int n){
        if(n==1) return "0";
        String s=findString(n-1);
        String ans=s+1;
        ans=ans+reverseInvert(s);
        return ans;
    }
    static String reverseInvert(String s) {
        StringBuilder sb = new StringBuilder("");
        for (char c : s.toCharArray()) {
            if (c == '0')
                sb.append('1');
            else 
                sb.append('0');
        }
        return sb.reverse().toString();
    }
}

//Input: n = 3, k = 1
//Output: "0"
//Explanation: S3 is "0111001".
//The 1st bit is "0".

// Another approach 

class Solution {
      public char findKthBit(int n, int k) {
        if(n == 1)
            return '0';
        int len = 1 << n; 
        if(k < len/2) 
            return findKthBit(n-1, k); 
        if(k == len/2)
            return '1'; 
        return findKthBit(n-1, len - k) == '0' ? '1' : '0'; 
    }
}
