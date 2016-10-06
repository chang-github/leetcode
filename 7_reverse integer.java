public class Solution {
public int reverse(int x) {
        if(x<Integer.MAX_VALUE&&x>Integer.MIN_VALUE){
        boolean f = true;
        if(x<0){
          x= 0-x;  
          f = false;
        } 
        if(x<10){
            if(f) return x;
            else return 0-x;
        }
        ArrayList<Integer> r = new ArrayList<Integer>();
        while(x>0){
           r.add(x%10);
           x=x/10;
        }
        long result = 0;
        int l = 1;
        for(int i=0;i<r.size();i++){
            result = (long)r.get(r.size()-i-1)*l+result;
            l=l*10;
            if(result>=Integer.MAX_VALUE) return 0;
        }
        if(f) return (int)(result);
        else return (int)(0-result);
    }
	return 0;
}
}