// Approach 1 ==> Using Set

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashSet<Character> set= new HashSet();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for(String s:words){
            boolean flag=true;
            for(int i=0;i<s.length();i++){
                if(!set.contains(s.charAt(i))){
                    flag=false;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}

/*Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.*/

// Approach 2 ==> Using Map

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            map.put(allowed.charAt(i),i);
        }
        for(String s:words){
            int j=0;
            while(j<s.length()){
                Character c=s.charAt(j);
                if(!map.containsKey(c)) break;
                else j++;
                if(j==s.length()) count++;
            }
        }
        return count;
    }
}
