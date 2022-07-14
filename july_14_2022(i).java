// Approach 1 ==> Using Stack
// Time Complexity ==>0(n)

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(isOpening(curr)){st.push(curr);}
            else{
                if(st.isEmpty()) {
                    return false;
                }
                else if(!isMatching(st.peek(),curr)){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
        
        
    }
    boolean isOpening(char c){
         if(c=='('){
            return true;
        }
        if(c=='['){
            return true;
        }
        if(c=='{'){
            return true;
        }
        return false;       
    }
    boolean isMatching(char a,char b){
        if(a=='(' && b==')'){
            return true;
        }
        if(a=='[' && b==']'){
            return true;
        }
        if(a=='{' && b=='}'){
            return true;
        }
        return false;
    }
}
