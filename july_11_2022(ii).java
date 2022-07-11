// Approach 1 ==> Time complexity ==> O(nlogn)

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char []array1=s.toCharArray();
        char []array2=t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);
        
    }
} 

// Approach 2 ==> Time complexity ==> 0(n)

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int []alpha = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            alpha[s.charAt(i) - 'a']++; // Calculating acsii value of i and subtracting with value of a than+1;
            alpha[t.charAt(i) - 'a']--; // Calculating acsii value of i and subtracting with value of a than-1;
        }
        for(int i = 0; i < alpha.length; i++)
            if(alpha[i] != 0) return false;
        
        return true;
    }
}
