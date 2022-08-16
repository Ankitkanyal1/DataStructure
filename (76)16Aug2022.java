// Approach 1 ==> Two pointer || Time Complexity ==> O(N) || Space Complexity ==> O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int x=1;
        int y=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[y]) x+=1;
            else x=1;
            if(x<=2){
                nums[++y]=nums[i];
                System.out.println(y+" "+i);
            }
        }
        return y+1;
    }
}

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
