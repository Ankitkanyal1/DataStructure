// Approach 1 ==> Using Stack || Time Complexity ==> O(N) 

class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0)return 0;
        Stack<Integer> stack=new Stack();
        char []c=s.toCharArray();
        char op='+';
        int curr=0;
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){
                curr=curr*10+c[i]-'0';
            }
            if(!Character.isDigit(c[i]) && c[i]!=' '|| i==c.length-1){
                if(op=='+'){stack.push(curr);}
                else if(op=='-'){stack.push(-curr);}
                else if(op=='*'){stack.push(stack.pop()*curr);}
                else if(op=='/'){stack.push(stack.pop()/curr);}
                curr=0;op=c[i];
            }
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}

Input: s = "3+2*2"
Output: 7
