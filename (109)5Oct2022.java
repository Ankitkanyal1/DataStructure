// Approach 1 ==> Using Recursion 

class Solution {
    public int subsetXORSum(int[] nums) {
        return getAns(nums,0,0);
    }
    public int getAns(int[] arr,int i, int curr){
        if(arr.length==i) return curr;
        return getAns(arr,i+1,curr^arr[i])+getAns(arr,i+1,curr);
    }
}

/*Input: nums = [1,3]
Output: 6
Explanation: The 4 subsets of [1,3] are:
- The empty subset has an XOR total of 0.
- [1] has an XOR total of 1.
- [3] has an XOR total of 3.
- [1,3] has an XOR total of 1 XOR 3 = 2.
0 + 1 + 3 + 2 = 6*/
