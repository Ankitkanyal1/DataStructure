// Approach 1 ==> Time Complexity ==>O(N) || Space Complexity ==> O(1)

class Solution {
    public int maximum69Number (int num) {
        int i=0,count=0;
        int temp=num;
        while(temp!=0){
            i++;
            int digit=temp%10;
            temp=temp/10;
            if(digit==6) count=i;
        }
        return num+3*(int)Math.pow(10,count-1);
    }
}

/*Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.*/

// Approach 2 ==> Using STringBuilder Class

class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='6') {sb.setCharAt(i,'9'); break;}
        }
        return Integer.parseInt(sb.toString());
    }
}
