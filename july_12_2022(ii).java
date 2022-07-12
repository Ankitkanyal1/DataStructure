class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []all=new int[26];
        char []array1=ransomNote.toCharArray();
        char []array2=magazine.toCharArray();
        for(char ch:array2){
            all[ch-'a']++;
        }
        for(char ch:array1){
            if(all[ch-'a']==0){
                return false;
            }
            all[ch-'a']--;
        }
        return true;
    }
}
