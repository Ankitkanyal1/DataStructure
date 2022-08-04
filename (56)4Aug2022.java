// Approach 1 ==> Using Deque || Time Complexity ==> O(N) || Space Complexity ==> O(N)

class Solution {
    public String simplifyPath(String path) {
        Deque<String> deque=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        String []s=path.split("/");
        for(int i=0;i<s.length;i++){
            if(!deque.isEmpty() && s[i].equals("..")) deque.poll();
            else if(!s[i].equals("") && !s[i].equals(".") && !s[i].equals("..")){
                deque.push(s[i]);
            }
        }
        if(deque.isEmpty()) return "/";
        while(!deque.isEmpty()){
            sb.append("/").append(deque.pollLast());
        }
        return sb.toString();
    }
}

Input: path = "/home/"
Output: "/home"
  
 
