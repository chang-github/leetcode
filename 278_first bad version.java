/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long start = 1;
        long end = n;
        long mid = (start + end)/2;
        while(start!=end){
            if(isBadVersion((int)mid)) end = mid;
            else start = mid+1;
            mid = (start + end)/2;//if n is very large the sum will exceed integer limit
        }
        return (int)mid;
    }
}