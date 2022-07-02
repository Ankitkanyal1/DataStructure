// Time Complexity = 0(n*n)
// Approach 1 ==> Brute force

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
       for(int i=0;i<n;i++){
            int count=0; 
           for(int j=0;j<n;j++){
                if(nums[i]>nums[j]&& i!=j){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
        
    }
}

// Approach 2
// Time Complexity = 0(n)

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int temp[]= new int[101];// its provides all empty storage (0) to 100)
        // for storing all elements of array 
        for(int i=0;i<n;i++){
            temp[nums[i]]++; // stores all nums[8,1,2,2,3] value in temp like [0,1,2,1,0,0,0,0,1,......till 100]
        }
        for(int i=1;i<101;i++){
            temp[i]=temp[i]+temp[i-1];//stores all temp like[0,1,3,4,4,4,4,4,5,5,5,5.....5]
            
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[i]=0;}
            else{
                ans[i]=temp[nums[i]-1];}
        }
        
        return ans;
    }
}
