// Appraoch 1 ==> Time Complexity ==> O(N*N)

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int l= grid.length;
        int ans=0;
        int[] row=new int[l];
        int[] col=new int[l];
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                row[i]=Math.max(row[i],grid[i][j]);
                col[j]=Math.max(col[j],grid[i][j]);
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
            ans+=Math.min(row[i],col[j])-grid[i][j];
            }
        }
        return ans;
    }
}

/*Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
Output: 35
Explanation: The building heights are shown in the center of the above image.
The skylines when viewed from each cardinal direction are drawn in red.
The grid after increasing the height of buildings without affecting skylines is:
gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]*/
