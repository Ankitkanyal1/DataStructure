// Approach 1 ==> Dynamic Programmin || Time Complexity ==> O(N)

class Solution {
    public int countVowelStrings(int n) {
        int dp[]=new int[5];
        Arrays.fill(dp,1);
        int ans=0;
        for(int i=2;i<=n;i++){
            for(int j=3;j>=0;j--){
                dp[j]=dp[j]+dp[j+1];
            }
        }
        for(int a:dp){
            ans+=a;
        }
        return ans;
    }
}

/*Input: n = 2
Output: 15
Explanation: The 15 sorted strings that consist of vowels only are
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.*/

// Approach 2 ==> By Math Formula 

class Solution {
    public int countVowelStrings(int n) {      
        return (n+4)*(n+3)*(n+2)*(n+1)/24;
    }
}
