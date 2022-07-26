// Apporach 1 ==> Brute Force  || Time Complexity ==> O(rXc)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l1=matrix.length;
        int l2=matrix[0].length;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
        
    }
}

//Appraoch 2 ==> Time Complexity ==> O(n) 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l1=matrix.length;
        int l2=matrix[0].length;
        int row=0;
        int col=l2-1;
        while(row>=0 && col>=0 && row<l1 && col<l2){
            if(target>matrix[row][col]){
                row++;
            }
            else if(target==matrix[row][col]){
                return true;
            }
            else{col--;}
        }
        return false;
    }
}
