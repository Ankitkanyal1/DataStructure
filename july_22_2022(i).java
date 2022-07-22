// Approach 1 ==> Brute Force 
//Time Complexity ==> O(nXn)

class Solution {
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
         rotateArrayByOne(nums,nums.length);   
        }
   }
    public static void rotateArrayByOne(int array[], int n){
        int i, temp;   
        temp = array[n - 1];   
        for (i = n-1; i > 0; i--)   
           array[i] = array[i - 1];       
           array[0] = temp;      
    }
}   


//Approach 2
// Time Complexity ==> 
class Solution {
    public void rotate(int[] nums, int k){
        if(k>nums.length){
            k%=nums.length;
        }
        int ans[]=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<k;i++){
            ans[i]=nums[n-k+i];
        }
        for(int i=k;i<n;i++){
            ans[i]=nums[i-k];
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
        
    }
}
