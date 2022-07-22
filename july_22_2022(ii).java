// Approach 1 || Time Complexity ==> O(n)  || Space Complexity ==> O(n)

class Solution {
    public void moveZeroes(int[] nums) {
        int temp[]=new int[nums.length];
        int n=nums.length;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp[j]=nums[i];
                j++;
            }
            else{
                temp[n-1]=nums[i];
              }
            }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }   
     }
}
