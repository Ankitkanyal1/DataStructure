// Approach 1 ==> Two pointer approach
// Time complexity ==> 0(n)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int r=0;
        int c=matrix[0].length-1;  //3
        while(r<matrix.length && c>=0){  // matrix.length=3
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]<target) r++;
            else c--;
        }
        return false;
    }
}
