// Approach 1 ==> Brute Force  || Time Complexity ==> O(n^3) Not recommended

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]<nums[j]&&nums[j]<nums[k]) return true;
                }
            }
        }
        return false;
        
    }
}

//Approach 2==> Time Complexity ==>O(n)

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        if(n<3)return false;
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=a) a=nums[i];
            else if(nums[i]<=b) b=nums[i];
            else return true;
        }
        return false;
    }
}
