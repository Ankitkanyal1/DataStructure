// Approach 1 ==> Using HashMap || Time Complexity ==> O(n)
class Solution {
    public int romanToInt(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int ans=map.get(s.charAt(s.length()-1));
       for(int i=s.length()-2;i>=0;i--){
           if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
               ans-=map.get(s.charAt(i));
           }
           else ans+=map.get(s.charAt(i));
       }
       return ans;
    }
}

// Approach 2 ==> Using Switch || Time Complexity == O(n)

class Solution {
    public int romanToInt(String s) {
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        char ch[]=s.toCharArray();
        int ans=0;
        for(int i=0;i<ch.length;i++){
            switch(ch[i]){
                    case 'I':ans=ans+1;break;
                    case 'V':ans=ans+5;break;
                    case 'X':ans=ans+10;break;
                    case 'L':ans=ans+50;break;
                    case 'C':ans=ans+100;break;
                    case 'D':ans=ans+500;break;
                    case 'M':ans=ans+1000;break;
            }
        }
        return ans;
    }
}
