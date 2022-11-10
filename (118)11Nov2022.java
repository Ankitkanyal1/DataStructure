// Approach 1 ==> Time Complexity ==> O(N) || Space Complexity ==> O(N)

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[nums.length/2];
        int n=nums.length-1;
        int ans=0;
        int sum=0;
        for(int i=0;i<nums.length/2;i++){
            sum=nums[i]+nums[n];n--;
            arr[i]=sum;
        }
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
}

/*Input: nums = [3,5,2,3]
Output: 7
Explanation: The elements can be paired up into pairs (3,3) and (5,2).
The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.*/

// Appraoch 2 ==> Time Complexity ==> O(N) 

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int ans=0;
        int sum=0;
        for(int i=0;i<nums.length/2;i++){
            sum=nums[i]+nums[n-i];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
