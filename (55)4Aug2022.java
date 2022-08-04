// Approach 1 ==> Time Complexity ==> O(Max(n1,n2)

class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length(),n2=b.length();
        int i=0;
        int carry=0;
        String result="";
        while(i<n1 || i<n2 || carry!=0){
            int s1=0;
            if(i<n1 && a.charAt(n1-1-i)=='1') s1=1;
            int s2=0;
            if(i<n2 && b.charAt(n2-1-i)=='1') s2=1;
            result=(s1+s2+carry)%2+result;
            carry=(s1+s2+carry)/2;
            n1--;n2--;
        }
        return result;
    }
}

Input: a = "11", b = "1"
Output: "100"
  
// Approach 2 ==> Time Complexity ==> O(N)
  
class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length(),n2=b.length();
        int i=0;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while(i<n1 || i<n2 || carry!=0){
            int s1=0;
            if(i<n1 && a.charAt(n1-1-i)=='1') s1=1;
            int s2=0;
            if(i<n2 && b.charAt(n2-1-i)=='1') s2=1;
            int sum=s1+s2+carry;
            result.append(sum%2);
            carry=(s1+s2+carry)/2;
            n1--;n2--;
        }
        return result.reverse().toString();
    }
}
