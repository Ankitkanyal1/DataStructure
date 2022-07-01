//Two pointers Approach
// Time complexity O(n)
//Approach 1 =Two pointer approach

class Solution {
    public int trap(int[] height) {
        int l=height.length-1,left=0,right=0, ans=0, i=0;
        while(i<l){
            if(height[i]<=height[l]){
                left=Math.max(left,height[i]);
                ans+=left-height[i];
                i++;
            }
            else{
                right=Math.max(right,height[l]);
                ans+=right-height[l];
                l--;
            }
        }
        return ans;
    }
}



//Approach 2=MaxLeft& MaxRight arrray

class Solution {
    public int trap(int[] height) {
        int l=height.length,ans=0;
        int []left=new int[l];
        int []right=new int[l];
        left[0]=height[0];
        right[l-1]=height[l-1];
        for(int i=0;i<l;i++){
            if(i==0){
                left[0]=height[0];
                right[l-1]=height[l-1];
            }
            else{
                left[i]=Math.max(height[i],left[i-1]);
                right[l-i-1]=Math.max(height[l-i-1],right[l-i]);
            }
        
        }
        
        for(int i=0;i<l;i++){
            ans+=Math.min(left[i],right[i])-height[i];
        }
        
        return ans;
    }
}
