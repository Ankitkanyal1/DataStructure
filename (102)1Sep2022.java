// Approach 1 ==> Two Pointer || Time Complexity ==> O(N)

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;j++;
            }
            else {
                j++;
            }
        }
        return (i==s.length());
    }
}

/*Input: s = "abc", t = "ahbgdc"
Output: true*/

// Approach 2 ==> Recursive Approach

class Solution {
    public boolean isSubsequence(String s, String t) {
        return recursion(s,0,t,0);
    }
    public boolean recursion(String s, int i, String t, int j){
        if(i==s.length()) return true;
        if(i<s.length()&&j==t.length()) return false;
        if(s.charAt(i)==t.charAt(j)) return recursion(s,i+1,t,j+1);
        else return recursion(s,i,t,j+1);
    }
}


