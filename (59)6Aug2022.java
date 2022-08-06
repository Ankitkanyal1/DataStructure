// Approach 1 ==> Time Complexity ==> O(N) 

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");
        int max=Math.max(s1.length,s2.length);
        for(int i=0;i<max;i++){
            int a=i<s1.length?Integer.parseInt(s1[i]):0;
            int b=i<s2.length?Integer.parseInt(s2[i]):0;
            if(a>b) return 1;
            else if(a<b) return -1;
        }
        return 0;
    }
}

Input: version1 = "1.01", version2 = "1.001"
Output: 0

class Solution {
    public int compareVersion(String version1, String version2) {
        version1=version1.replace('.', '/');    // as we can't split with . using . so we replace . with /
        version2=version2.replace('.', '/');
        String s1[]=version1.split("/");
        String s2[]=version2.split("/");
        int max=Math.max(s1.length,s2.length);
        for(int i=0;i<max;i++){
            int a=i<s1.length?Integer.parseInt(s1[i]):0;
            int b=i<s2.length?Integer.parseInt(s2[i]):0;
            if(a>b) return 1;
            else if(a<b) return -1;
        }
        return 0;
    }
}
