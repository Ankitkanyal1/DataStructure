// Approach 1 ==> Using Recursion || Time Complexity ==> O(n)

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits.length()==0) return list;
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        recursion(digits,0,map,new StringBuilder(),list);
        return list;
    }
    public static void recursion(String digits,int i,HashMap<Character,String> map,StringBuilder sb,List<String> list){
        if(i==digits.length()){
            list.add(sb.toString());
            return ;
        }
        String curr=map.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++){
            sb.append(curr.charAt(k));
            recursion(digits,i+1,map,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

// Approach 2 ==> Using Backtracking || Time Complexity ==> O(n)

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;
        String []set=new String[10];
        set[2]="abc";
        set[3]="def";
        set[4]="ghi";
        set[5]="jkl";
        set[6]="mno";
        set[7]="pqrs";
        set[8]="tuv";
        set[9]="wxyz";
        backtracking(digits,0,set,"",ans);
        return ans;
    }
    public void backtracking(String digits,int start,String[] set,String curr, List<String> ans){
        if(start==digits.length()){
            ans.add(curr);
            return;
        }
        String s=set[digits.charAt(start)-'0'];
        for(char c:s.toCharArray()){
            backtracking(digits,start+1,set,curr+c,ans);
        }
    }
}
