// Approach 1 ==> Time Complexity ==> O(CodeUsedInString) || Space Complexity ==> O(1)

class Solution {
    public String intToRoman(int num) {
        int []value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder s=new StringBuilder();
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                s.append(symbol[i]);
                num-=value[i];
            }
        }
        return s.toString();
    }
}

// Approach 2 ==> Time Complexity ==> O(n) 
class Solution {
    public String intToRoman(int num) {
        int []value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder s=new StringBuilder();
        int val=0;
        while(num>0){
            if(num-value[val]>=0){
                s.append(symbol[val]);
                num-=value[val];
            }
            else val++;
        }
        return s.toString();
    }
}
