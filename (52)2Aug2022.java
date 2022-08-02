// Approach 1 ==> Using Recursion & StringBuilder class  || Time complexity ==> O(n) || Space Complexity ==> O(1)

class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1);
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            count++;
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
                sb.append(count).append(s.charAt(i));
                count=0;
            }
        }
        return sb.toString();
    }
}

// Approach 2 ==> Using Recursion || Time Complexity ==> O(N) || Space Complexity ==> O(N)

class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1);
        int count=0;
        String sb="";
        for(int i=0;i<s.length();i++){
            count++;
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
                sb=sb+count+s.charAt(i);
                count=0;
            }
        }
        return sb;
    }
}
