// Time Complexity ==> O(n)

class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int i=0;
        while(i<n){
            swap(s,i,n-1);
            i++;n--;
            
        }
        
    }
    public void swap(char[] s,int a,int b){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
}
