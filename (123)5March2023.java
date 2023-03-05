class Solution {
    public int totalFruit(int[] fruits) {
        int lastfruit=-1;
        int secondlastfruit=-1;
        int lastfruitCount=0;
        int curr=0,max=0;
        for(int tree:fruits){
            if(tree==lastfruit||tree==secondlastfruit) curr+=1;
            else curr=lastfruitCount+1;
            
            if(tree==lastfruit)lastfruitCount+=1;
            else lastfruitCount=1;

            if(tree!=lastfruit){
                secondlastfruit=lastfruit;
                lastfruit=tree;
            }
            max=Math.max(curr,max);
        }
        return max;
    }
}
