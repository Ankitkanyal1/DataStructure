// Approach 1 ==> Sliding Window 
// Time Complexity ==> O(n)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen=new HashSet();
        int left=0,right=0;
        int max=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(seen.add(c)){
                max=Math.max(max,right-left+1);
                right++;
            }
            else{
                while(s.charAt(left)!=c){
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
            }
        }
        return max;
    }
}
