public class Solution {
    public int reverse(int x) {
     //   if(x<Integer.MAX_VALUE&&x>Integer.MIN_VALUE){
            boolean f = true;
            long r = 0;
            if(x<0){
                x = -1*x;
                f = false;
            }
            while(x>0){
                r = r*10+x%10;
                x=x/10;
                if(r>Integer.MAX_VALUE) return 0;
            }
            if(f) return (int)(r);
            else return (int)(-1*r);
       // }
      //  return 0;
    }
}