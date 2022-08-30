// Approach 1 ==> Iterative || Time Complexity ==> O(1)

class Solution {
    public boolean divisorGame(int n) {
          return n%2==0;
    }
}

/*Input: n = 2
Output: true
Explanation: Alice chooses 1, and Bob has no more moves.*/

// Approaach 2 ==> Dynamic Programming

class Solution {
    public boolean divisorGame(int n) {
          if ( n == 1){
              return false;
      }else{
              return !divisorGame(n -1);
      }
    }
}
