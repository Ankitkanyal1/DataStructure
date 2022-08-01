// Approach 1 ==> Brute Force || Time Complexity ==> O(no. of character in haystack X no. of character in needle)

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            int j=0;
            for(;j<needle.length()&&(i+j)<haystack.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    continue;
                }
                else break;
            }
            if(needle.length()==j) return i; 
        }
        return -1;
    }
}

// Approach 2 ==> Using Strings Library || Time Complexity ==> O(n)

class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(needle.isEmpty()) return 0;
        for(int i=0;i<=n-m;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+m).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
} 
