// Approach 1 ==> Time Complexity ==> O(N)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        if(nums.length==1){
            return (double)max/k;
        }
        int sum=max;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            max=Math.max(sum,max);
        }
        double ans=(double)max/k;
        return ans;
    }
}

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
