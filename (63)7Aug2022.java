// Appraoch 1 ==> Time Complexity ==> O(nlogn)

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
        if(arr[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        for(String ans:arr){
            sb.append(ans);
        }
        return sb.toString();
    }
}

Input: nums = [10,2]
Output: "210"
