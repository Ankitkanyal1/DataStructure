// Approach 1 ==> Time Complexity ==> O(N)

class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==1) return 1; 
        int temp=0,temp1=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                if(temp==0)temp=i+1;
                else temp1=i;
            }
            else if(temp!=0 && s.charAt(i)==' '){
                temp1=i+1;
                break;
            }
        }
        return s.substring(temp1,temp).length();
    }
}
Input: s = "Hello World"
Output: 5
