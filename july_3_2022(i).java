// Approach 1 ==> Brute force not recommended
// Time complexity = 0(n^2)

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        for(int i=0;i<n;i++){
            int stopcount=0,total=0,j=i;
            while(stopcount<n){
                total+=gas[j%n]-cost[j%n];
                if(total<0){
                    break;
                }
                stopcount++;
                j++;
            }
            if(stopcount==n&&total>=0)
                return i;
        }
        return -1;
    }
}

//Approach 2 
// Time complexity

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int total=0,tank=0,index=0;
        for(int i=0;i<n;i++){
            int consume=gas[i]-cost[i];
            tank+=consume;
            if(tank<0){
                index=i+1;
                tank=0;
            }
            total+= consume;
        }
      
        return total < 0 ? -1 : index; //if total is less than 0 return -1 else return index
    }
}
