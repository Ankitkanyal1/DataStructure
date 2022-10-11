// Approach 1 ==> Time Complexity ==> O(N) || Space Complexity ==> O(N)

class Solution {
    public int[] diStringMatch(String s) {
        int arr[]=new int[s.length()+1];
        int forD=s.length();
        int forI=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[k++]=forI++;
            }
            else arr[k++]=forD--;
        }
        arr[k++]=forD;
        return arr;
    }
}

/*Input: s = "IDID"
Output: [0,4,1,3,2]*/

// Approach 2 ==> 

class Solution {
    public int[] diStringMatch(String s) {
        int[] arr=new int[s.length()+1];
        int l=0;
        int r=s.length();
        for(int i=0;i<arr.length-1;i++){
            if(s.charAt(i)=='I'){
                arr[i]=l;
                l++;
            }
            else{
                arr[i]=r;
                r--;
            }
        }
        arr[arr.length-1]=l;
        return arr;
    }
}
