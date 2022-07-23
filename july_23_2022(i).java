// Approach 1 ==> Sorting || Time Complexity ==> O(nlogn) || Space Complexity ==> O(n)

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        for(int[] i:intervals){
            if(list.size()==0){
                list.add(i);
            }
            else{
                int[] preInterval=list.get(list.size()-1);
                if(i[0]<=preInterval[1]){
                    preInterval[1]=Math.max(i[1],preInterval[1]);
                }
                else{
                    list.add(i);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}


// Approach 2==> Sorting & Two pointer || Time Complexity==>O(nlogn)+O(n) 

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[0],b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }
            else{
                ans.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[0][]);
    }
}
