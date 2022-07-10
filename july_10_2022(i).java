// Time Complexity ==> 0(n)

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c) return mat;
        if(r==m&&n==c) return mat;
        int ne=0;
        int pre=0;
        int ans[][]=new int [r][c];
        while(ne<r*c && pre<m*n){
            ans[ne/c][ne%c]=mat[pre/n][pre%n];
            ne++;
            pre++;
        }
        return ans;
    }
}
