// Approach 1 ==> Using HashMap || Time Complexity ==> O(N)

class Solution {
    public String transform(String s){
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i);
            }
            else{
                sb.append(String.valueOf(map.get(c)));
                sb.append(" ");
                }
        }
        return sb.toString();
    }
    public boolean isIsomorphic(String s, String t) {
        return transform(s).equals(transform(t));
    }
}

Input: s = "egg", t = "add"
Output: true
