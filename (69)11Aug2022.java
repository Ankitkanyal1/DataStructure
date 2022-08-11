// Approach 1 ==> Time Complexity ==> O(N)

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                ans=Math.min(ans,i+1-left);
                sum-=nums[left];left++;
            }
        }
        return (ans!=Integer.MAX_VALUE)?ans:0;
    }
}

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
