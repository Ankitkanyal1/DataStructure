// Appraoch 1 ==> Using Sorting || Time Complexity ==> O(NlogN)+O(N)

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) return nums[i];
        }
        return -1;
    }
}

Input: nums = [1,3,4,2,2]
Output: 2
  
// Approach 2 ==> Using Set || Time Complexity ==> O(N)
  
class Solution {
    public int findDuplicate(int[] nums) {
       Set<Integer> seen=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])) return nums[i];
            seen.add(nums[i]);
        }
        return -1;
    }
}

// Approach 3 ==> 
