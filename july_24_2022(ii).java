// Approch 1 ==> Brute Force 
// Time Complexity ==> O(n*n)

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    list.add(1);
                }
                else{
                    list.add(ans.get(i-2).get(j)+ans.get(i-2).get(j-1));
                }
            }
            ans.add(list);
        }
        return ans.get(ans.size()-1);
        
    }
}

Approach 2 ==> 
