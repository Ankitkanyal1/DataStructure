// Approach 1 ==> Recurive approach 
 
class Solution {
    public int[] countBits(int n) {
        int nums[]=new int[n+1];
        for(int i=0;i<=n;i++){
            nums[i]=recursion(i);
        }
     return nums;   
    }
    
    public static int recursion(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n%2==0) return recursion(n/2);
        else return 1+recursion(n/2);
    }
}

/*Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101*/

// Approach 2 ==> Dyanimc Programming Approach 

class Solution {
    public int[] countBits(int n) {
        int nums[]=new int[n+1];
        for(int i=0;i<=n;i++){
            nums[i]=recursion(i,nums);
        }
     return nums;   
    }
    
    public static int recursion(int n, int[] ans){
        if(n==0) return 0;
        if(n==1) return 1;
        if(ans[n]!=0) return ans[n];
        if(n%2==0){
            ans[n]=recursion(n/2,ans);
            return recursion(n/2,ans);}
        else{
            ans[n]=1+recursion(n/2,ans);
            return 1+recursion(n/2,ans);}
    }
}

