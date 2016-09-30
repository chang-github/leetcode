public class Solution {
    public void rotate(int[] nums, int k) {
        int step = k;
        if(k>=nums.length){
            step=k%nums.length;
        }
        int[] newnums = new int[nums.length];
        for(int i=0;i+step<nums.length;i++){
                newnums[i+step]=nums[i];
        }
        for(int i=0;i<step;i++){
                newnums[step-i-1]=nums[nums.length-i-1];
        
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=newnums[i];
        }
    }
}