// Approch 1 ==> Brute Force 
class Solution {
    public int longestConsecutive(int[] nums) {   //  [100,4,200,1,3,2]
        int ans=0;
        HashSet<Integer>hs=new HashSet<>(); // to avoid duplicate values
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);            // use to insert values in HashSet
        }
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){        // if there is no previous value of nums[i] inside the hashset than condition is true. For ex : if nums[0] = 100 than, 
                int num=nums[i];               //  hs.contains check if 100-1 is present in hashSet or not
                while(hs.contains(num)){
                    num++;
                }
                if(ans<num-nums[i]){
                    ans=num-nums[i];
                }
            }
        }
        return ans; 
        
        
    }
}
