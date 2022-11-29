// Approach 1 ==> Using Stack || Time Complexity ==> O(N)

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack();
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else {
                if(st.size()>0 && st.peek() =='('){
                    st.pop();
                }
                else st.push(c);
            }
        }
        return st.size();
    }
}

/*Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3*/

// Approach 2 ==> Time Complexity ==> O(N) || Space Complexity ==> O(1)

class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0, bal=0;
        for(int i=0;i<s.length();i++){
            bal+=s.charAt(i)=='('?1:-1;
            if(bal==-1){
                ans++;
                bal++;
            }
        }
        return ans+bal;
    }
}
