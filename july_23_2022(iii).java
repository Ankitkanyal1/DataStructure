// Approach 1 ==> Two Pointer Approach 
// Time Complexity ==> O(n)

class Solution {
    public String reverseWords(String s) {
         char []ch=s.toCharArray();
         int right=0;
         int left=0;
         int n=ch.length;
         for(;right<n;right++){
            if(ch[right]==' '){
                reverse(ch,left,right-1);
                left=right+1;}
           }
         reverse(ch, left , right - 1);
         return new String(ch); 
    }
    
    public static void reverse(char[] ch,int left, int right){
       while(left<right){
          char temp=ch[left];
          ch[left]=ch[right];
          ch[right]=temp;
          left++;
          right--;
       }
    }
}
