// Approach 1 ==> HashSet || Time Complexity ==> O(NXN)

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1&&!set.contains(n)){
            set.add(n);
            int sum=0;
            while(n>0){
                sum+=Math.pow((n%10),2);
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
  
// Approach 2 ==> Recursion 
  
  class Solution {
    public boolean isHappy(int n) {
        if(n==1)return true;
        else if(n>1&&n<7) return false;
        else {
            int sum=0;
            while(n>0){
                sum+=Math.pow((n%10),2);
                n/=10;
            }
            return isHappy(sum);
        }
    }
}
