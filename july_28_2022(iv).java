// Approach 1 ==> Using Array || Time Complexity ==> O(n) || Space Complexity ==> O(1)

class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        int ans=0;
        int []lc=new int[26];
        int []uc=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c-'a'>=0)lc[c-'a']++;
            else uc[c-'A']++;
        }
        boolean isFirstOdd=false;
        for(int i=0;i<26;i++){
            if(lc[i]%2==0){
                ans+=lc[i];
            }
            else{
                if(isFirstOdd==false){
                    ans+=lc[i];
                    isFirstOdd=true;
                }
                else ans+=lc[i]-1;
            }
        }
        for(int i=0;i<26;i++){
            if(uc[i]%2==0){
                ans+=uc[i];
            }
            else{
                if(isFirstOdd==false){
                    ans+=uc[i];
                    isFirstOdd=true;
                }
                else ans+=uc[i]-1;
            }
        }
        return ans;
    }
}
