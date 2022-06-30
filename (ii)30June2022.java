//Time complexity ==> O(n)

class Solution {
    public void sortColors(int[] nums) {
        int l=nums.length;
        int i=0, left=0, right=l-1;
        while(i<=right){
            if(nums[i]==0){
                swap(nums,left++,i++);
            }
            else if(nums[i]==2){
                swap(nums,i,right--);
            }
            else{
                i++;
            }
            
        }
        
    }


    public void swap(int []nums,int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}

