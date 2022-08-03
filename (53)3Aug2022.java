// Approach 1 ==> Time Complexity ==> O(N*N) 

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))return "0";
        int n1=num1.length();
        int n2=num2.length();
        int pf=0;
        int ans[]=new int[n1+n2];
        int i=n2-1;
        while(i>=0){
            int ival=num2.charAt(i)-'0';
            int k=ans.length-1-pf;
            int carry=0;
            int j=n1-1;
            i--;
            while(j>=0 || carry!=0){
                int jval=j>=0?num1.charAt(j)-'0':0;
                int product=ival*jval+carry+ans[k];
                ans[k]=product%10;
                carry=product/10;
                k--;j--;
            }
            pf++;
        }
        String s="";
        boolean zero=true;
        for(int val:ans){
            if(val==0 && zero==true){
                continue;
            }
            else{
                zero=false;
                s+=val;
            }
        }
        return s;
    }
}

//Approach 2 ==> Using StringBuilder class || Time Complexity ==> O(N*N)

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))return "0";
        int n1=num1.length();
        int n2=num2.length();
        int pf=0;
        int ans[]=new int[n1+n2];
        int i=n2-1;
        while(i>=0){
            int ival=num2.charAt(i)-'0';
            int k=ans.length-1-pf;
            int carry=0;
            int j=n1-1;
            i--;
            while(j>=0 || carry!=0){
                int jval=j>=0?num1.charAt(j)-'0':0;
                int product=ival*jval+carry+ans[k];
                ans[k]=product%10;
                carry=product/10;
                k--;j--;
            }
            pf++;
        }
        StringBuilder s=new StringBuilder();

        boolean zero=true;
        for(int val:ans){
            if(val==0 && zero==true){
                continue;
            }
            else{
                zero=false;
                s=s.append(val);
            }
        }
        return s.toString();
    }
}
