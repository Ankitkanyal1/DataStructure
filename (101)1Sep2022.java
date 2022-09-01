// Approach 1 ==> Dynamic Programming || Time Complexity ==> O(N)

class Solution {
    public int getMaximumGenerated(int n) {
        if(n<2) return n;
        int []nums=new int[n+1];
        nums[0]=0;
        nums[1]=1;
        int max=0;
        for(int i=2;i<=n;i++){
            if(i%2==0) nums[i]=nums[i/2];
            else nums[i]=nums[i/2]+nums[i/2+1];
            max=Math.max(max,nums[i]);
        }
        return max;
    }
}

/*Input: n = 7
Output: 3
Explanation: According to the given rules:
  nums[0] = 0
  nums[1] = 1
  nums[(1 * 2) = 2] = nums[1] = 1
  nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
  nums[(2 * 2) = 4] = nums[2] = 1
  nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
  nums[(3 * 2) = 6] = nums[3] = 2
  nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
Hence, nums = [0,1,1,2,1,3,2,3], and the maximum is max(0,1,1,2,1,3,2,3) = 3.*/

