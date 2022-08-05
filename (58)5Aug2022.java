// Approach 1 ==> Using Stack || Time Complexity ==> O(N)

class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        String temp="";
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(temp.length()>0){
                    st.push(temp);
                    temp="";
                }
            }
            else{
                temp=temp+s.charAt(i);
            }
        }
        ans=ans+temp;
        while(!st.isEmpty()){
            ans=ans+" "+st.pop();
        }
        if(!ans.isEmpty() && ans.charAt(0)==' ') ans=ans.substring(1);
        return ans;
    }
}

Input: s = "the sky is blue"
Output: "blue is sky the"
  
// Approach 2 ==> Using StringBuilde || Time Complexity ==> O(N)
  
  class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i >= 0) {
            if(sb.length()!=0 && s.charAt(i) == ' ') {
                ans.append(" ");
                ans.append(sb.reverse());
                sb.setLength(0);
            } else if(s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }
            i--;
        }
        if(sb.length()!=0) {
            ans.append(" ");
            ans.append(sb.reverse());
        }
        ans.delete(0,1);
        return ans.toString();
    }
}
