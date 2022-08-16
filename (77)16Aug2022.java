// Approach 1 ==> Brute Force || Time Complexity ==> O(NxNxN)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list=new HashSet<>();
        int adds=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    adds=nums[i]+nums[j]+nums[k];
                    if(i!=j && i!=k && j!=k && adds==0){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return new ArrayList(list);
    }
}

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
  
// Approach 2 ==> Two Pointer || Time Complexity ==> O(NxN)
  
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list=new HashSet<>();
        int adds=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;            
            while(j<k){
                adds=nums[j]+nums[k];
                if(adds==-nums[i]){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));j++;k--;
                }
                else if(adds>-nums[i])k--;
                else if(adds<-nums[i])j++;
            }  
        }        
        return new ArrayList(list);
    }
}

