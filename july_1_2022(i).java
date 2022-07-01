//Two pointers Approach
// Time complexity O(n)
//Approach 1 =Two pointer approach

class Solution {
    public int trap(int[] height) {
        int l=height.length-1,left=0,right=0, ans=0, i=0;
        while(i<l){
            if(height[i]<=height[l]){
                left=Math.max(left,height[i]);
                ans+=left-height[i];
                i++;
            }
            else{
                right=Math.max(right,height[l]);
                ans+=right-height[l];
                l--;
            }
        }
        return ans;
    }
}
