// Approach 1 ==> Brute Force Not recommended

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      for(int i=0;i<nums.length-1;i++){
          for(int j=i+1;j<nums.length;j++){
              if(nums[i]==nums[j]&& Math.abs(i-j)<=k){
                  return true;
              }
          }
      }
        return false;
    }
}

Input: nums = [1,2,3,1], k = 3
Output: true
  
// Approach 2 ==>  
