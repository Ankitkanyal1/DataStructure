// Approach 1 ==> Using Array 

class Solution {
    public int minimumSum(int num) {
        int min=0;
        int arr[]=new int[4];
        while(num!=0){
            arr[min++]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        int a=arr[0]*10+arr[2];
        int b=arr[1]*10+arr[3];
        return a+b;
    }
}

/* Input: num = 2932
Output: 52
Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.*/

// Approach 2 ==> Using 
