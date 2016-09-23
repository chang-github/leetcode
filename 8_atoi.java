public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()){
            return 0;
        }
        str = str.trim();
        int l=0;
        int sign = 1;
        if(str.charAt(0)=='-'){//"" ''
            sign=-1;
            l++;
        }if(str.charAt(0)=='+'){
            l++;
        }
        long result=0;
        for (int i=l; i < str.length(); i++ ){
            if(str.charAt(i)<='9'&&str.charAt(i)>='0'){
                result = 10*result+str.charAt(i)-'0';
            }else if(l!=0&&i==1) return 0;
            else return (int)(sign*result);
            if(sign*result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
        }
        return (int)(sign*result);
    }
}
