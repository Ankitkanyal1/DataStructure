// Approach 1 ==> Time Complexity ==> O(N) || Space Complexity ==> O(1)

class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(char c:n.toCharArray()){
            ans=Math.max(ans,c-'0');
        }
        return ans;
    }
}

/*Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32*/

// Approach 2 ==> 

class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='9') return 9;
            ans=Math.max(ans,n.charAt(i)-'0');
        }
        return ans;
    }
}
