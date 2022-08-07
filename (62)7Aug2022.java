// Approach 1 ==> Time Complexity ==> O(N)

class Solution {
    public String convertToTitle(int columnNumber) {
       String s="";
       while(columnNumber!=0){
           columnNumber--;
           int n=columnNumber%26;
           s=(char)(n+'A')+s;
           columnNumber/=26;
       }
        return s;
    }
}

Input: columnNumber = 1
Output: "A"
  
// Approach 2 ==> Using Recursion ==> O(N)
  
  class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        recursive(columnNumber,sb);
        return sb.toString();
    }
    public static void recursive(int n, StringBuilder sb){
        if(n==0){
            return;
        }
        char c=(char)('A'+(--n % 26));
        recursive(n/26,sb);
        sb.append(c);        
    }
}
