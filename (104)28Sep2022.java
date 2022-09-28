// Approach 1 ==> Using Bitwise Xor || Time Complexity ==> O(N)

class Solution {
    public int[] decode(int[] encoded, int first) {
        int ans[]=new int[encoded.length+1];
        ans[0]=first;
        for(int i=0;i<encoded.length;i++){
            ans[i+1]=ans[i]^encoded[i];
        }
        return ans;
    }
}

/*Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]*/

// Approach 2 ==> Bitmanipulation || Time Complexity ==> O(N)

class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
           num=(num&1)==1?num^1:num>>1;
            steps++;
        }
        return steps;
    }
}

// Approach 3 ==> Iterative 

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            count++;
        }
        return count;
    }
}

// Approach 4 ==> Recursive 

class Solution {
    public int numberOfSteps(int num) {
        return count(num, 0);
    }
    private int count(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return count(num / 2, steps + 1);
        }
        return count(num - 1, steps + 1);
    }
}
