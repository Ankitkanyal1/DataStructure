// Approach 1 ==> Using Queue 

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> qu=new LinkedList();
        for(int i=1;i<n+1;i++){
            qu.offer(i);
        }
        System.out.println("Queue: " + qu);
        while(qu.size()!=1){
            for(int j=1;j<k;j++){
                qu.offer(qu.poll());
            }
            System.out.println(qu);
            qu.poll();
        }
        System.out.println("Ans: " + qu);
        return qu.poll();
    }
}

/*Input: n = 5, k = 2
Output: 3
Explanation: Here are the steps of the game:
1) Start at friend 1.
2) Count 2 friends clockwise, which are friends 1 and 2.
3) Friend 2 leaves the circle. Next start is friend 3.
4) Count 2 friends clockwise, which are friends 3 and 4.
5) Friend 4 leaves the circle. Next start is friend 5.
6) Count 2 friends clockwise, which are friends 5 and 1.
7) Friend 1 leaves the circle. Next start is friend 3.
8) Count 2 friends clockwise, which are friends 3 and 5.
9) Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.*/

//Approach 2 ==> Josephus Problem || Time Complexity ==> O(N)

class Solution {
    public int findTheWinner(int n, int k) {
     return (n==1)?1:(findTheWinner(n-1,k)+k-1)%n +1;
    }
}
