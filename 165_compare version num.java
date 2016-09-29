public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int l = v1.length>=v2.length? v1.length:v2.length;
        for (int i = 0; i<l; i++){
            int c1 = i< v1.length? Integer.parseInt(v1[i]):0;
            int c2 = i< v2.length? Integer.parseInt(v2[i]):0;
            if(c1<c2){
                return -1;
            }
            if(c1>c2){
                return 1;
            }
        }
        return 0;
    }
}