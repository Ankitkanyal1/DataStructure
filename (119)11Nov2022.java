// Approach 1 ==> Using HashMap

class Solution {
    public List<Integer> partitionLabels(String s) {
       HashMap<Character,Integer> map=new HashMap();
        //Counting the impact of characters
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           map.put(c,i);
       }
       int max=0,prev=-1;
       List<Integer> ans=new ArrayList();
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           max=Math.max(max,map.get(c));
           if(max==i){
               ans.add(max-prev);
               prev=max;
           }
       }
        return ans;
    }
}

/*Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.*/

// Approach 2 ==> Using array

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        int j=0,anchor=0;
        List<Integer> ans=new ArrayList();
        for(int i=0;i<s.length();i++){
            j=Math.max(j,arr[s.charAt(i)-'a']);
            if(i==j){
                ans.add(i-anchor+1);
                anchor=i+1;
            }
        }
        return ans;
    }
}
