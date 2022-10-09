// Approach 1 ==> Time Complexity ==> O(N) || Space Complexity ==> O(N)

class Solution {
    public int balancedStringSplit(String s) {
        int r=0,l=0,ans=0;
        char ch[]=s.toCharArray();
        for(char c:ch){
            if(c=='R') r++;
            else l++;
            if(l==r) ans++;
        }
        return ans;
    }
}

/*Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.*/

// Approach 2 ==> Using STack || Time Complexity ==> O(N) || Space Complexity ==> O(N)

class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> st=new Stack();
        int ans=0;
        for(char c:s.toCharArray()){
            if(st.isEmpty()||st.peek()==c) st.push(c);
            else st.pop();
            if(st.isEmpty()) ans++;
        }
        return ans;
    }
}

// Approach 3 ==> Time Complexity ==> O(N) || Space Complexity ==> O(1)

class Solution {
    public int balancedStringSplit(String s) {
        int ans=0,r=0;
        for(int i=0;i<s.length();i++){
            r+=s.charAt(i)=='L'?1:-1;
            if(r==0) ans++;
        }
        return ans;
    }
}
