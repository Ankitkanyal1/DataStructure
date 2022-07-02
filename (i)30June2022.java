//#Approach 1

/*Time complexity: O(n) where nn is the length of input array.
Space complexity: O(1) since we don't use any additional space to find the running sum. Note that we do not take into consideration the space occupied by the output array.
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        
        for(int i=0;i<l-1;i++){
            nums[i+1]=nums[i]+nums[i+1];
        }
        
    return nums; }
}

/*#Approach 2: Using Separate Space

Time complexity: O(n) where n is the length of the input array. This is because we use a single loop that iterates over the entire array to calculate the running sum.
Space complexity: O(1) since we don't use any additional space to find the running sum. Note that we do not take into consideration the space occupied by the output array.
*/
class Solution {
public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length]; // created new array 

        // Initialize first element of result array with first element in nums.
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}
