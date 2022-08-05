// Approach 1 ==> Using regex || Time Complexity ==> O(N)

class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")) return true;
        String sb = s.replaceAll("(_)|\\W","").toLowerCase(); //  use this for beter ans --> s.replaceAll("[^a-zA-Z0-9]", "");
        int right=sb.length()-1;
        String ans="";
        for(int i=right;i>=0;i--){
            ans+=sb.charAt(i);
        }
        if(sb.equals(ans)) return true;
        return false;
    } 
}

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

// Approach 2 ==> Two Pointer || Time Complexity ==> O(N)

class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb=new StringBuilder();
       for(char c:s.toCharArray()){
           if(c>='A' && c<='Z'){
               sb.append((char) ((int) c + 32));
           }
           if(c>='a' && c<='z' || (c >= '0' && c <= '9')){
               sb.append(c);
           }
       }
       String ans=sb.toString();
       int start=0;
       int end=ans.length()-1;
       while(start<=end){
           if(ans.charAt(start)!=ans.charAt(end)){
               return false;
           }
           start++;
           end--;
       }
       return true; 
    } 
}
