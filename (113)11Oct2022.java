// Approach 1 ==> 

class Solution {
    public int minOperations(int[] nums) {
        if(nums.length ==1 || nums.length==0) return 0;
        int count =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                int val=nums[i]-nums[i+1]+1;
                nums[i+1]=nums[i]+1;
                count+=val;
            }
        }
        return count;
    }
}

/*Input: nums = [1,1,1]
Output: 3
Explanation: You can do the following operations:
1) Increment nums[2], so nums becomes [1,1,2].
2) Increment nums[1], so nums becomes [1,2,2].
3) Increment nums[2], so nums becomes [1,2,3].*/

// Approach 2 ==>

class Solution {
    public int minOperations(int[] nums) {
        if(nums.length ==1 || nums.length==0) return 0;
        int count =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int val=nums[i-1]-nums[i]+1;
                count+=val;
                nums[i]=nums[i]+val;
            }
        }
        return count;
    }
}
