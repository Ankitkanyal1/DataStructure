// Appraoch 1 ==> Using Stack || Time Complexity ==> O(N)

class Solution {
    public String decodeString(String s) {
        Stack<Integer> stackNum=new Stack();
        Stack<StringBuilder> stackSt=new Stack();
        StringBuilder sb=new StringBuilder();
        int num=0;
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                num=num*10+c-'0';
            }
            else if(c=='['){
                stackSt.push(sb);
                sb=new StringBuilder();
                stackNum.push(num);
                num=0;
                
            }
            else if(c==']'){
                StringBuilder temp=sb;
                sb=stackSt.pop();
                int count=stackNum.pop();
                while(count>0){
                    sb.append(temp);
                    count--;
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

//Input: s = "2[abc]3[cd]ef"
//Output: "abcabccdcdcdef"

// Appraoch 2 ==> Recursion with queue data type

class Solution {
    public String decodeString(String s) {
        Queue<Character> q=new LinkedList();
        for(char c:s.toCharArray()) q.add(c);
        return decode(q);
    }
    
    public String decode(Queue<Character> q){
        StringBuilder sb=new StringBuilder();
        int num=0;
        while(!q.isEmpty()){
            char c=q.remove();
            if(Character.isDigit(c)){
                num=num*10+c-'0';
            }
            else if(c=='['){
                String sub=decode(q);
                sb.append(repeat(sub,num));
                num=0;
            }
            else if(c==']'){
                break;
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public String repeat(String s,int num){
        StringBuilder sb=new StringBuilder();
        while(num-->0){
            sb.append(s);
        }
        return sb.toString();
    } 
}
