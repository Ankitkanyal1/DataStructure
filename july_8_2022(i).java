// Approach 1 ==> Time Complexity 0(n)

class Solution {
    public int[] productExceptSelf(int[] nums) { // [1,2,3,4]
        int []right=new int[nums.length];
        int product=1; 
        for(int i=nums.length-1;i>=0;i--){  // [24,24,12,4]
            product*=nums[i];
            right[i]=product;
        }
        product=1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length-1;i++){    //[24,12,8,4]
            int r=right[i+1];
            ans[i]=product*r;
            product*=nums[i];
             
        }
        ans[nums.length-1]=product;          //[24,12,8,6]
        return ans;
    }
}
