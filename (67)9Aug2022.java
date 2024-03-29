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

// Approach 2 ==> Without using Stack || Time Complexity ==> O(N) || Space Complexity ==> O(1)
    class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0)return 0;
        char op='+';
        int curr=0,lastNum=0,result=0;
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(Character.isDigit(current)){
                curr=(curr*10)+(current-'0');
            }
            if(!Character.isDigit(current) && !Character.isWhitespace(current)|| i==s.length()-1){
                if(op=='+'||op=='-'){result+=lastNum;lastNum=(op=='+')?curr:-curr;}
                else if(op=='*'){lastNum=lastNum*curr;}
                else if(op=='/'){lastNum=lastNum/curr;}
                curr=0;op=current;
            }
        }
        result+=lastNum;
        return result;
    }
}
