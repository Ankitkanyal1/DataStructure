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
