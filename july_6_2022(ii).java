// Approach 1 ==> Time complexity O(n)

class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            if(ans>max){
                max =ans;}
            if(ans<0){
                ans=0;} 
        }
        return max;
    }
}


// Approach 2 ==> O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            max=Math.max(ans,max);
            if(ans<0){
                ans=0;}
            }
        return max;
    }
}
