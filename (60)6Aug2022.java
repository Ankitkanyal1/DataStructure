// Approach 1 ==> Time Complexity ==> O(N)

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb=new StringBuilder();
        if(numerator<0 && denominator>0 || numerator>0 && denominator<0) sb.append("-");
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        long q=num/den;
        long r=num%den;
        sb.append(q);
        if(r==0){
            return sb.toString();
        }
        else{
            sb.append(".");
            HashMap<Long,Integer> map=new HashMap<>();
            while(r!=0){
                if(map.containsKey(r)){
                    sb.insert(map.get(r),"(");
                    sb.append(")");
                    break;
                }
                else{
                    map.put(r,sb.length());
                    r*=10;
                    q=r/den;
                    r=r%den;
                    sb.append(q);
                }
            }
        }
        return sb.toString();        
    }
}

Input: numerator = 1, denominator = 2
Output: "0.5"
